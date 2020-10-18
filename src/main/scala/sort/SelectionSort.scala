package sort

object SelectionSort {
    /**
     * 选择排序:
     * 本质:
     *     1. 首先选择第 1 个数为最小的数, 然后让这个数和后面所有的数比较,
     * 一轮下来找到最小的数, 然后把最小的放在第 1 个位置
     *     2. 再选择第 2 个数为第 2 小的数, 再后面逐次比较,.......
     *
     * @param array
     */

    def selectionSort(array: Array[Int])={
        //只需要把N-1个元素排好剩下一个自然有序
        for (i<-0 until array.length-1){
            //假设当前位置（i是当前下标）的值最小，并记录下标
            var minIndex = i
            //让i和之后的元素逐个比较
            for (j <- i+1 until array.length){
                //若有比i小的，记录该元素下标
                if (array(i)>array(j)){
                    minIndex=j
                }
                //将记录的下标对应值与i对应值进行交换
                if (i!=minIndex){
                    var tmp = array(i)
                    array(i)=array(minIndex)
                    array(minIndex)=tmp
                }
            }

        }

    }


}
