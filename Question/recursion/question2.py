# Find the sum of numbers from 1 to N using recursion.
# Example: N = 5 → 15

def sum_numbers(n):
    if n==0:
        return 0
    return n + sum_numbers(n-1)
    
print(sum_numbers(6))