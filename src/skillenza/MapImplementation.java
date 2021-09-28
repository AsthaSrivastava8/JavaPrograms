package skillenza;

class Node<K, V> {
    K key;
    V value;
    Node<K, V> next;

    public Node(K key, V value, Node<K, V> next) {
        this.key = key;
        this.value = value;
        this.next = next;

    }
}

public class MapImplementation<K, V> {
    public final static int SIZE = 16;
    Node[][] buckets = new Node[16][16];

    public static void main(String[] args) {

        MapImplementation<Integer, String> mapImplementation = new MapImplementation<>();
        mapImplementation.put(1, "Astha");
        mapImplementation.put(1, "Lalala");
        mapImplementation.put(5, "Five");
        mapImplementation.put(190, "One ninety");
        mapImplementation.put(23, "Twenty three");
        mapImplementation.put(0, "Zero");
        mapImplementation.put(4, "Astha");

        System.out.println(mapImplementation.get(190));
    }

    public void put(K key, V value) {
        int hashCode = key.hashCode();
        int index = hashCode & (SIZE - 1);
        Node[] list = buckets[index];
        int size = list.length;
        int i = 0;
        boolean isInserted = false;
        while (i < size && list[i] != null) {
            if (list[i].key.equals(key)
                    && list[i].key.hashCode() == hashCode) {
                list[i].value = value;
                isInserted = true;
                break;
            }
            i++;
        }
        if (!isInserted) {
            list[i] = new Node(key, value, null);
            if (i > 0
                    && list[i - 1] != null)
                list[i - 1].next = list[i];
        }
    }

    public V get(K key) {
        int hashCode = key.hashCode();
        int index = hashCode & (SIZE - 1);
        Node[] nodesAtIndex = buckets[index];
        int size = nodesAtIndex.length;
        int i = 0;
        while (i < size && nodesAtIndex[i] != null) {
            if (nodesAtIndex[i].key.hashCode() == hashCode) {
                return (V) nodesAtIndex[i].value;
            }
            i++;
        }
        return null;
    }
}
