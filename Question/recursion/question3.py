# Calculate the factorial of a number using recursion.
# Example: N = 5 → 120

def calculate_factorial(n):
    # base
    if n<=1:
        return 1

    return n*calculate_factorial(n-1)

print(calculate_factorial(5));

    