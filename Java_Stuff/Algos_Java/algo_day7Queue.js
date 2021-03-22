// Queue
// FIFO (First in, first out)

class Queue {
    constructor() {
        this.front = null; // sometimes called head "front of the line"
        this.back = null; // sometimes called rear or tail "back of the line"
        this.count = 0;
    }

    // add nodes to the rear of the queue
    enqueue(node) {
        if (!this.front) {
            node.next = null;
            this.back = node;
            this.count++;
        } else {
            node.next = this.back;
            this.back = node;
            this.count++;
        }
    }

    // remove nodes from the front of the queue
    dequeue() {
        if (this.isEmpty()) return null;
        var toDelete = this.front;
        this.front = toDelete.next;
        toDelete.next = null;
        this.count--;
    }

    // check the front of the queue without removing it
    peek() {
        return this.front.data;
    }

    // return true / false if queue is empty
    isEmpty() {
        if (this.front === null) {
            return true;
        }
        return false;
    }

    // return count
    count() {
        return this.count;
    }
}

class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}

// print every value in the queue
// you may only use one queue or stack for additional storage
// return the queue back to it's original order when you are done
// you are not allowed to linearly traverse the queue
// only use public methods enqueue, dequeue, peek, isempty, and count
function readQueue(queue) {
    var temp = new Queue();
    while (!queue.isEmpty()) {
        var tempNode = queue.dequeue();
        console.log(tempNode.peek);
        temp.enqueue(tempNode);
    }
    while (!temp.isEmpty()) {
        queue.enqueue(temp.dequeue());
    }
    return queue;
}



// Queue
// FIFO (First in, first out)

class Queue {
    constructor() {
        this.front = null; // sometimes called head "front of the line"
        this.back = null; // sometimes called rear or tail "back of the line"
        this.length = 0;
    }

    enqueue(node) {
        if (this.back === null) { // if back is null, list is empty
            this.back = node;
            this.front = node;
        } else { // otherwise add to back
            this.back.next = node;
            this.back = node;
        }
        this.length++;
    }

    // remove from the front
    dequeue() {
        if (this.front === null) {
            return null; // if empty return nothing
        };
        if (this.front === this.back) {
            this.back = null;
        };
        let node = this.front;
        this.front = node.next;
        node.next = null;
        this.length--;
        return node;
    }

    // check the front of the queue
    peek() {
        // return this.front ? this.front.data : this.front;
        return this.front;
    }

    // return if empty
    isEmpty() {
        return this.front === null;
    }

    // return length
    count() {
        return this.length;
    }
}

class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}

// print every value in the queue
// you may only use one queue or stack for additional storage
// return the queue back to it's original order when you are done
// you are not allowed to linearly traverse the queue
// only use public methods enqueue, dequeue, peek, isempty, and length
function readQueue(queue) {
    var tempQueue = new Queue();

    while (!queue.isEmpty()) {
        var tempNode = queue.dequeue();
        console.log(tempNode.data);
        tempQueue.enqueue(tempNode);
    }

    while (!tempQueue.isEmpty()) {
        queue.enqueue(tempQueue.dequeue());
    }

    return queue;
}

function readQueue2(queue) {
    var length = queue.count();

    while (length) {
        var node = queue.dequeue();
        console.log(node.data);
        queue.enqueue(node);
        length--;
    }
}