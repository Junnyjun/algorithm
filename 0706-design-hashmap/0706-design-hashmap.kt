class MyHashMap() {
    private val arr = arrayOfNulls<Int>(1000001)

    fun put(key: Int, value: Int) {
        arr[key] = value
    }

    fun get(key: Int) = arr[key] ?: -1

    fun remove(key: Int) {
        arr[key] = null
    }
}