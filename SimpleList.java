package src.ifma.lista03;

public class SimpleList {
    private Node head;

    public SimpleList() {
        this.head = null;
    }

    public void adicionarInicio(String element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void adicionarFim(String element) {
        if (head == null) {
            adicionarInicio(element);
        } else {
            Node newNode = new Node(element);
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public String removerComeco() {
        if (head == null) {
            throw new RuntimeException("A lista está vazia");
        } else {
            String element = head.element;
            head = head.next;
            return element;
        }
    }

    public String removerFinal() {
        if (head == null) {
            throw new RuntimeException("A lista está vazia");
        } else if (head.next == null) {
            return removerComeco();
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            String element = current.next.element;
            current.next = null;
            return element;
        }
    }

    @Override
    public String toString() {
        if (head == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node current = head;
        while (current != null) {
            sb.append(current.element);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
