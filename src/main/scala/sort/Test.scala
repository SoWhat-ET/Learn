package sort
object Test {
    def main(args: Array[String]): Unit = {
        val arr = new Array[Int](8)
        println("请输入数组的元素：")
        for (i <- 0 until arr.length){
            arr(i)=Console.readInt()
        }
        println("原始数组：")
        println(arr.mkString(","))

        println("冒泡排序：")
        BubbleSort.bubbleSort(arr)
        println(arr.mkString(","))


        println("插入排序：")
        InsertionSort.insertionSort(arr)
        println(arr.mkString(","))

        println("选择排序：")
        SelectionSort.selectionSort(arr)
        println(arr.mkString(","))

        println("快速排序：")
        QuickSort.quickSort(arr)
        println(arr.mkString(","))

    }
}
