package mcon364.las.touro.edu;

import java.util.List;
import java.util.Optional;

class Main{
    public static void main(String[] args) {
        getGreeting("USERNAME");
        getGreeting("NO_SUCH_VAR");
        List<List<Integer>> data = List.of(
                List.of(5, 10, 15),     // Processes completely
                List.of(20, 0, 25),     // Finds 0, skips to next list
                List.of(30, 35, 40),    // Processes completely
                List.of(45, 99, 50),    // Finds 99, terminates everything
                List.of(55, 60, 65)     // Never reached
        );
        processValues(data);
    }
    public static Optional<String> getUserName(String envVarName){
        String result = System.getenv(envVarName);
        return Optional.ofNullable(result);
    }
    public static String getGreeting(String envVarName){
        StringBuilder stringbuilder = new StringBuilder();
        if(getUserName(envVarName).isEmpty()){
            stringbuilder.append("Hello, World");
        }
        else{
            stringbuilder.append("Hello, "+getUserName(envVarName).get());
        }
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
