package mcon364.las.touro.edu;

import java.util.List;
import java.util.Optional;

class Main{
    public static void main(String[] args) {

    }
    public static Optional<String> getUserName(String envVarName){
        String result = System.getenv(envVarName);
        return Optional.ofNullable(result);
    }
    public static String getGreeting(String envVarName){
        StringBuilder stringbuilder = new StringBuilder();
        var result = getUserName(envVarName);
        stringbuilder.append(result);
        return stringbuilder.toString();
    }

    public static int processValues(List<List<Integer>> data){
        int processedRows = 0;
        for(List<Integer> list:data){
            if(list.contains(99)){break;}
            for(Integer i:list){
                if(i==0){continue;}
                processedRows++;
            }
        }
        return processedRows;
    }
}
