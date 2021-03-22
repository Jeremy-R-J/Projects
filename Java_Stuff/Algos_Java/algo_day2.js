class Node {
    constuctor(data) {
        this.data = data;
        this.next = null;
    }
}

class SLL {
    constructor() {
        this.head = null;

    }

    isEmpty() {
        if (this.head) {
            return true;
        } else {
            return false;
        }
    }
    node.next = this.head; //this is how you move the node around
    this.head = node;
    // }
}

addToFront(node) {}

addDataToFront(data) {}

}



var node = new Node(10);
var mySLL = new SLL();

node.data = 13;
node.next = new Node(14);