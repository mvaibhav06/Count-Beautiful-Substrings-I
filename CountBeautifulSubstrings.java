public class CountBeautifulSubstrings {
    public static int beautifulSubstrings(String s, int k) {
        int out = 0;

        for(int i=0; i<=s.length()-1; i++){
            char ch = s.charAt(i);
            int v = 0;
            int c = 0;
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                v++;
            }else{
                c++;
            }
            for(int j=i+1; j<s.length(); j++){
                char myChar = s.charAt(j);
                if(myChar=='a' || myChar=='e' || myChar=='i' || myChar=='o' || myChar=='u'){
                    v++;
                }else{
                    c++;
                }
                if(v==c && (v*c)%k==0){
                    out++;
                }
            }
        }
        return out;
    }

    public static void main(String[] args) {
        System.out.println(beautifulSubstrings("pulorolqcvhafexui",9));
        // p-0 l-2 r-4 l-6 q-7 c-8 v-9 h-10 f-12 x-14
        // u-1 o-3 o-5 a-11 e-13 u-15 i-16
        // c v c v c v c c c c c v c v c v v
    }
}
