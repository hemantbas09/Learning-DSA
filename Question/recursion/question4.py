# Reverse a string using recursion.
# Example: "hello" → "olleh"

def reverse_string(value):
    # Base case:
    if len(value) <= 1:
        return value

    # Recursive case
    return reverse_string(value[1:]) + value[0]


print(reverse_string("hello"))