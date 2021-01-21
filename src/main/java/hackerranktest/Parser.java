package hackerranktest;


class Parser{
    boolean isBalanced(String input){
        boolean flag = false ;
        int count = 0 ;

        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == '(') {
                count++ ;
            } else if(input.charAt(i) == '{') {
            	count = count + 2 ;
            } else if(input.charAt(i) == '}') {
            	count = count - 2 ;
            } else if(input.charAt(i) == ')') {
                count-- ;
            }

            if(count == 0 && i == input.length() - 1) {
                return true ;
            } else if(count < 0) {
            	return false;
            }
        }

        return flag ;
    }
}

