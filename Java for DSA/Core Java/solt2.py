import sys

def interact():
    t = int(input().strip())  # Number of test cases
    
    for _ in range(t):
        n = int(input().strip())  # Target number
        
        commands = []
        
        # If `n` is a large number, attempting subtraction first might fail.
        if n >= 10:
            commands.append("add -10")  # Attempting to reduce x

        commands.append("add 1")  # Increment x
        commands.append("mul 10")  # Scale up x
        
        # Final confirmation
        commands.append("!")

        for cmd in commands:
            print(cmd)
            sys.stdout.flush()

interact()