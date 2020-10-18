package sort

object InsertionSort {
    def insertionSort(array: Array[Int]) = {
        //外循环控制比较次数，一共需要比较N-1次
        for (i <- 0 until array.length - 1) {
            //从 i+1 的位置开始向前比较，如果比前面小则交换位置
            for (j <- i + 1 until(0, -1)) {
                if (array(i) > array(i + 1)) {
                    var tmp = array(i)
                    array(i) = array(i + 1)
                    array(i + 1) = tmp
                }
            }
        }
    }
}
