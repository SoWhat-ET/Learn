package sort

object QuickSort {
    /**
     * 快速排序算法
     *
     * @param array
     */
    def quickSort(array: Array[Int]): Unit = {
        sort(array, 0, array.length - 1)
    }

    /**
     * 快排，分阶段：把数组按照基准值分成两半，小于基准值的在左边，大于基准值的在右边。并且返回
     * 基准值在数组中有序的位置
     *
     * @param array
     * @param left
     * @param right
     */

    def partion(array: Array[Int], left: Int, right: Int): Int = {
        //取第一个为基准值
        val p: Int = array(left)
        //定义两个可变的左右指针
        var l: Int = left
        var r: Int = right
        //若左指针小于右指针就一直进行扫描
        while (l < r) {
            //若左指针指向的值小于基准值，且小于等于右指针则继续扫描
            while (array(l) <= p && l < r) {
                //l指向下一个
                l += 1
            }
            //若右指针指向的值大于基准值，且大于左指针则继续扫描
            while (array(r) > p && l <= r) {
                //l指向下一个
                r -= 1
            }
            //小于p的去左边，大于p的去右边
            if(l<=r){
                var tmp=array(l)
                array(l)=array(r)
                array(r)=tmp
            }
        }
        // 让参考元素去到正确的位置, 右指针已经到了小于 p 的区域, 所以可以和右指针的元素进行交
        array(left)=array(r)
        array(r)=p
        // 现在右指针就是分割位置
        r

    }

    /**
     * 快排，治阶段：
     *
     * @param array
     * @param left
     * @param right
     */
    def sort(array: Array[Int], left: Int, right: Int): Unit = {
        //若左指针跑到了右指针的右边或相等，则证明有序退出算法
        if (left >= right) return
        //对数组进行分区操作，得到基准值有序的位置
        var m: Int = partion(array, left, right)
        //对m的左边进行排序
        sort(array, left, m - 1)
        //对m的右边进行排序
        sort(array, m + 1, right)

    }
}
