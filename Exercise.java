public class Exercise{
  public static void Exercise(int[] list){

	for (int i = 0; i < list.length - 1; i++){
	int currentMin = list[i];
	int currentMinIndex = i;

	for (int j = 0; j < list.length - 1; i++){
	if (currentMin > list[j]) {
		currentMin = list[j];
		currentMinIndex = list[j];
	
}		
   }
	if (currentMinIndex != i) {
         list[currentMinIndex] = list[i];
           list[i] = currentMin;

}

}
}


     public static void main(String[] args) {
        int[] numbers = {9, 2, 7, 0, 5};

        System.out.println("Before Sorting:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        ArrayAccendingOrder(numbers);

        System.out.println("After Sorting:");
        for (int num : numbers) {
            System.out.print(num + " ");



