package dictionary;

public class Dictionary {
    private String keyWord;
    private String meaning;

    public Dictionary() {

    }

    public Dictionary(String keyWord, String meaning) {
        this.keyWord = keyWord;
        this.meaning = meaning;
    }

    public String getKeyWord() {
        return this.keyWord;
    }

    public void setKeyWord(String keyWord) {
        if (keyWord.length() > 50) {
            System.out.println("Nhập sai");
        }
        this.keyWord = keyWord;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }
    public void Tratu(String keyWord){
        this.keyWord=keyWord;
        switch (keyWord){
            case "hello":
                System.out.println(this.meaning="Xin CHào");
                break;
            case "face":
                System.out.println(this.meaning="Khuôn mặt");
                break;
            case "book":
                System.out.println(this.meaning="Sách");
                break;
        }

    }
}

