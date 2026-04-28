import numpy as np

np.random.seed(42)

def initialize_parameters(n_x, n_h, n_y):
    W1 = np.random.randn(n_h, n_x) * 0.01
    b1 = np.zeros((n_h, 1))
    W2 = np.random.randn(n_y, n_h) * 0.01
    b2 = np.zeros((n_y, 1))

    assert W1.shape == (n_h, n_x)
    assert b1.shape == (n_h, 1)
    assert W2.shape == (n_y, n_h)
    assert b2.shape == (n_y, 1)

    return {"W1": W1, "b1": b1, "W2": W2, "b2": b2}


def relu(Z):
    return np.maximum(0, Z)

def relu_derivative(Z):
    return (Z > 0).astype(float)


def forward_propagation(X, parameters):
    W1, b1 = parameters["W1"], parameters["b1"]
    W2, b2 = parameters["W2"], parameters["b2"]

    Z1 = W1 @ X + b1
    A1 = relu(Z1)
    Z2 = W2 @ A1 + b2
    A2 = Z2

    m = X.shape[1]
    assert A1.shape == (W1.shape[0], m)
    assert A2.shape == (W2.shape[0], m)

    return A2, {"Z1": Z1, "A1": A1, "Z2": Z2, "A2": A2}


def compute_cost(A2, Y):
    m = Y.shape[1]
    cost = (1/(2*m)) * np.sum((A2 - Y)**2)
    assert cost >= 0
    return np.squeeze(cost)


def backward_propagation(X, Y, cache, parameters):
    m = X.shape[1]
    W2 = parameters["W2"]

    A1, A2 = cache["A1"], cache["A2"]
    Z1 = cache["Z1"]

    dZ2 = A2 - Y
    dW2 = (1/m) * dZ2 @ A1.T
    db2 = (1/m) * np.sum(dZ2, axis=1, keepdims=True)

    dA1 = W2.T @ dZ2
    dZ1 = dA1 * relu_derivative(Z1)
    dW1 = (1/m) * dZ1 @ X.T
    db1 = (1/m) * np.sum(dZ1, axis=1, keepdims=True)

    assert dW1.shape == parameters["W1"].shape
    assert db1.shape == parameters["b1"].shape
    assert dW2.shape == parameters["W2"].shape
    assert db2.shape == parameters["b2"].shape

    return {"dW1": dW1, "db1": db1, "dW2": dW2, "db2": db2}


def update_parameters(parameters, grads, learning_rate):
    parameters["W1"] -= learning_rate * grads["dW1"]
    parameters["b1"] -= learning_rate * grads["db1"]
    parameters["W2"] -= learning_rate * grads["dW2"]
    parameters["b2"] -= learning_rate * grads["db2"]
    return parameters


def model(X, Y, n_h=4, num_iterations=10000, learning_rate=0.01, print_cost=False):
    parameters = initialize_parameters(X.shape[0], n_h, Y.shape[0])
    costs = []

    for i in range(num_iterations):
        A2, cache = forward_propagation(X, parameters)
        cost = compute_cost(A2, Y)
        grads = backward_propagation(X, Y, cache, parameters)
        parameters = update_parameters(parameters, grads, learning_rate)

        if i % 100 == 0:
            costs.append(cost)
        if print_cost and i % 1000 == 0:
            print("Iteration", i, "Cost =", cost)

    return parameters, costs
