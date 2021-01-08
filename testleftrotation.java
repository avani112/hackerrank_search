public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    // Write your code here
        List<Integer> result = new ArrayList<>(arr.size());
        for(int i=d;i<arr.size();i++)
            result.add(arr.get(i));
        for(int i=0;i<d;i++)
            result.add(arr.get(i));
        return result;

    }

}
