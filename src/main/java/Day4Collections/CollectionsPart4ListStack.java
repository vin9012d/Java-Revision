package main.java.Day4Collections;

import java.util.Stack;

public class CollectionsPart4ListStack {

  public static void main(String[] args) {

    Stack<Integer> stack = new Stack<>();

    // 1. push — add to top
    stack.push(10); // [10]
    stack.push(20); // [10, 20]
    stack.push(30); // [10, 20, 30]


    // 2. pop — remove from top, throws EmptyStackException if empty
    int top = stack.pop(); // 30, stack → [10, 20]

    // 3. peek — look at top without removing, throws EmptyStackException if empty
    int look = stack.peek(); // 20, stack still [10, 20]

    // 4. isEmpty — check if empty
    boolean empty = stack.isEmpty(); // false

    // 5. size — number of elements
    int size = stack.size(); // 2

    // 6. search — returns 1-based position from top, -1 if not found
    stack.push(30);
    stack.push(40); // [10, 20, 30, 40]
    int pos = stack.search(20); // 3 (3rd from top)
    int nope = stack.search(99); // -1

    // 7. contains — check if element exists
    boolean has = stack.contains(20); // true

    // 8. clear — remove everything
    stack.clear();
  }

  /*
  Then why not use Stack?

Because it exposes too many unwanted operations.

You can do:

stack.insertElementAt(99, 0);
stack.remove(1);
stack.addFirst(77);

Now it no longer behaves like a strict stack.

Modern recommendation

Instead of Stack, Java recommends:

Deque<Integer> stack = new ArrayDeque<>();

| Feature                | Stack                  | ArrayDeque               |
| ---------------------- | ---------------------- | ------------------------ |
| Legacy                 | Yes                    | No                       |
| Internally             | Vector (dynamic array) | Resizable circular array |
| Thread-safe            | Yes (synchronized)     | No                       |
| Allows list operations | Yes                    | No                       |
| Recommended today      | Rarely                 | Yes                      |



ArrayDeque only supports efficient operations at the first and last.

It does NOT support adding/removing at middle like ArrayList.
   */
}
