package tagContentExtractor;

public class TagContentExtractor {
    public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
        
        String regex = "<(.+)>([^<]+)</\\1>";
        Pattern pattern = Pattern.compile(regex);
        
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
          	//My code
            Matcher matcher = pattern.matcher(line);
			boolean found = false;

            while(matcher.find()) {
                found = true;
                System.out.println(matcher.group(2));
            }

            if(!found) {
                System.out.println("None");
            }
            testCases--;
        }
        in.close();
    }
}
