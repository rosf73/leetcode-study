import java.util.LinkedList

class LRUCache(private val capacity: Int) {

    private val cache = mutableMapOf<Int, Int>()
    private val lru = LinkedList<Int>()

    fun get(key: Int): Int {
        val temp = lru.remove(key)
        return if (temp) {
            lru.addFirst(key)
            cache[key] ?: -1
        } else {
            -1
        }
    }
 
    fun put(key: Int, value: Int) {
        if (cache.containsKey(key)) {
            lru.remove(key)
        } else if (lru.size == capacity) {
            val last = lru.last
            lru.removeLast()
            cache.remove(last)
        }
        cache[key] = value
        lru.addFirst(key)
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * var obj = LRUCache(capacity)
 * var param_1 = obj.get(key)
 * obj.put(key,value)
 */
