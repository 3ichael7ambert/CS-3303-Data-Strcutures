# CS3303 Data Structures Class Files

This repository contains my files from the CS3303 Data Structures class. The code is written in Java and uses Jeliot as the IDE.

## Description of the Stack Algorithm

The algorithm initializes an empty stack using a linked list, designed to track inspections in an automobile assembly line. It defines a `Node` class to represent each element in the stack and a `Stack` class with methods for pushing (`push`) and popping (`pop`) elements. The `push` method adds a new inspection stage onto the stack, while the `pop` method removes the top element, simulating an inspection completion. The `printAndPopAll` method sequentially pops and prints each element, representing the process of inspecting a vehicle at each station in the line.

The stack is implemented using a linked list to ensure efficient operations with constant time complexity \(O(1)\) for both push and pop operations. This design allows the stack to dynamically grow and shrink, avoiding the fixed size limitations of array-based implementations. By leveraging the linked list structure, the algorithm efficiently manages the inspection stages, ensuring that each inspection is accurately tracked and processed in a last-in, first-out (LIFO) manner, aligning with the requirements of the manufacturing process.

## Getting Started

To run the code, you can download and install Jeliot from [Jeliot Download](https://jelliot.en.uptodown.com/windows/download).

### Prerequisites

- Jeliot IDE
- Java Development Kit (JDK)

### Running the Code

1. Open the Jeliot IDE.
2. Load the Java files from this repository into Jeliot.
3. Run the `Stack` class to see the stack operations in action.

## Files

- `Node.java`: Defines the `Node` class used in the linked list.
- `Stack.java`: Implements the stack data structure with `push`, `pop`, and `printAndPopAll` methods.

## Contact

If you have any questions or need further assistance, please feel free to reach out.

Michael Lambert
