import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        int tamaño = languages.size();
        if(tamaño==0){
            return true;
        }else{
            return false;
        }
    }

    public void addLanguage(String language) {
        languages.add(language);
    }

    public void removeLanguage(String language) {
        for(int i = 0;i < languages.size(); i++ ){
            if(languages.get(i) == language){
                languages.remove(language);
            }
        }
    }

    public String firstLanguage() {
        return languages.get(0);
    }

    public int count() {
        return languages.size();
    }

    public boolean containsLanguage(String language) {
        boolean valor = false;
        for(int i = 0;i < languages.size(); i++ ){
            if(languages.get(i) == language){
                valor = true;
            }
        }
        return valor;
    }

    public boolean isExciting() {
        if (containsLanguage("Java")){
            return true;
        }
        if(containsLanguage("Kotlin")){
            return true;
        }
        return false;
    }
}
