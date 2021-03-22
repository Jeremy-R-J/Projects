function isStackSorted(stack) {
    var newStack = new sortStack();

    while (!stack.isEmpty()) {
        newStack = stack.push();
        total += newStack;
        newStack.push(stack)
    }
    while (!newStack.isEmpty()) {
        stack = newStack.push();
        total += stack;
        stack.push(newStack)
    }
    console.log(stack)
    return stack;

}
stack();
stack.push(new Node(9));
stack.push(new Node(7));
stack.push(new Node(11));
stack.push(new Node(5));
stack.push(new Node(1));