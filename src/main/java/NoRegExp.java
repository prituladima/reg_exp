public class NoRegExp {
    public static void main(String[] args) {

        String test = "abcddefgh";
        String subText = "dd";
//        System.out.println(test.contains(subText));

        int textlen = test.length();
        int subTextLen = subText.length();
        for(int i = 0; i < textlen; i++){
            char ch = test.charAt(i);

//            if(i + subTextLen > textlen) {
                boolean localRes = true;
                for (int j = i; j < Math.min(i + subTextLen, textlen); j++){
                    localRes &= (subText.charAt(j) == test.charAt(i));
                }
                if(localRes && !subText.isEmpty()){
                    System.out.println(i);
                }
//            }
        }

    }
}
