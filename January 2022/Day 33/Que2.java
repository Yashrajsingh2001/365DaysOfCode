// Que link: https://leetcode.com/problems/encode-and-decode-tinyurl/
// 535. Encode and Decode TinyURL



public class Codec {
    List<String> urls = new ArrayList<String>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        urls.add(longUrl);
        return String.valueOf(urls.size()-1);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int index = Integer.valueOf(shortUrl);
        return (index<urls.size())?urls.get(index):"";
    }
}




/*
//*! Tried it as a joke but it worked: 😂😂😂
public class Codec {
    //* Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        return longUrl;
    }

    //* Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return shortUrl;
    }
}
*/