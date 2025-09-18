import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Comparator;

public class HuffmanEnconder {

    private HuffmanTreeNode root;

    // Devuelve el nodo raíz del árbol de Huffman
    public HuffmanTreeNode getHuffmanTreeRoot() {
        return root;
    }

    // 1. Obtener frecuencias de caracteres
    protected HashMap<Character, Integer> getFrequency(String message) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char c : message.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        return freqMap;
    }

    // 2. Construir el árbol de Huffman
    protected HuffmanTreeNode buildTree(HashMap<Character, Integer> frequencies) {
        PriorityQueue<HuffmanTreeNode> pq = new PriorityQueue<>(new HuffmanTreeNodeComparator());

        for (char c : frequencies.keySet()) {
            pq.add(new HuffmanTreeNode(c, frequencies.get(c)));
        }

        while (pq.size() > 1) {
            HuffmanTreeNode left = pq.poll();
            HuffmanTreeNode right = pq.poll();
            HuffmanTreeNode parent = new HuffmanTreeNode(null, left.getFrequency() + right.getFrequency(), left, right);
            pq.add(parent);
        }

        root = pq.poll(); // Guardamos la raíz
        return root;
    }

    // 3. Generar el mapa de codificación desde el árbol de Huffman
    protected HashMap<String, String> getEncodingMap() {
        HashMap<String, String> encodingMap = new HashMap<>();
        buildEncodingMapHelper(root, "", encodingMap);
        return encodingMap;
    }

    // Helper recursivo para recorrer el árbol
    private void buildEncodingMapHelper(HuffmanTreeNode node, String code, HashMap<String, String> map) {
        if (node == null) return;

        if (node.isLeaf()) {
            map.put(String.valueOf(node.getCharacter()), code);
            return;
        }

        buildEncodingMapHelper(node.getLeft(), code + "0", map);
        buildEncodingMapHelper(node.getRight(), code + "1", map);
    }

    // 4. Comparador para la priority queue
    private class HuffmanTreeNodeComparator implements Comparator<HuffmanTreeNode> {
        @Override
        public int compare(HuffmanTreeNode o1, HuffmanTreeNode o2) {
            return Integer.compare(o1.getFrequency(), o2.getFrequency());
        }
    }
}
