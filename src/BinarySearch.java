public class BinarySearch {
    public Boolean elementSearch(int element) {
        int[] tab = new int[]{2, 7, 8, 9, 13, 15, 17};
        boolean isHere = false;
        int iFirst = 0;
        int iLast = tab.length - 1;
        int medium = (iFirst + iLast) / 2;
        while (iFirst <= iLast && isHere == false) {

            System.out.println("before" + iFirst + "  " + medium + "  " + iLast);
            if (tab[medium] < element) {
                iFirst = medium + 1;
                medium = (iFirst + iLast) / 2;
            } else if (tab[medium] > element) {
                iLast = medium - 1;
                medium = (iFirst + iLast) / 2;
            } else {
                isHere = true;
            }
            System.out.println("after" + iFirst + "  " + medium + "  " + iLast);
        }
        return isHere;
    }
}