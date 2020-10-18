package sort

object BubbleSort {
    /**
     * 冒泡排序算法
     * @param arr 需要排序的数组
     */
    def bubbleSort(arr: Array[Int])={
        //外层循环，控制需要排序的次数（长度为N的数组需要N-1次）
        for (i <- 0 until arr.length - 1) {
            //内层循环，控制每次排序需要比较的次数
            for (j <- 0 until arr.length - 1 - i) {
                if (arr(j) > arr(j + 1)) {
                    var tmp = arr(j)
                    arr(j) = arr(j + 1)
                    arr(j + 1) = tmp
                }
            }
        }
    }
}




