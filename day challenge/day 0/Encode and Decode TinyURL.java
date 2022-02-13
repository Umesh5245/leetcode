public class Codec {
 HashMap<String, String> longToShort = new HashMap<String, String>();
    HashMap<String, String> shortToLong = new HashMap<String, String>();
    String seed = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
         if (longToShort.containsKey(longUrl)) {
            return longToShort.get(longUrl);
        }
        String res = "";
        while (true) {
            res = random();
            if (!shortToLong.containsKey(res)) {
                shortToLong.put(res, longUrl);
                longToShort.put(longUrl, res);
                break;
            }
        }
        return res;
    }
    private String random(){
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 6; i ++) {
            int j = r.nextInt(62);
            sb.append(seed.charAt(j));
        }
        return sb.toString();
    }
    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        if (!shortToLong.containsKey(shortUrl)) {
            return null;
        }
        return shortToLong.get(shortUrl);
    }
    }


// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
