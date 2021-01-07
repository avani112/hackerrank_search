static int introTutorial(int V, int[] arr) {
        int x=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==V) x=i;
        }
        return x;

    }
