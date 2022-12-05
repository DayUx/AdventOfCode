public class action {

    public static int getResult(char ennemyAction, char myAction){
        switch (string2Int(myAction)) {
            case 1:
                if (3==string2Int(ennemyAction)){
                    return string2Int(myAction) + 6;
                } else if (1 == string2Int(ennemyAction)){
                    return string2Int(myAction) + 3;
                }
                return string2Int(myAction) + 0;
            case 2:
                if (1==string2Int(ennemyAction)){
                    return string2Int(myAction) + 6;
                } else if (2 == string2Int(ennemyAction)){
                    return string2Int(myAction) + 3;
                }
                return string2Int(myAction) + 0;

            case 3:
                if (2==string2Int(ennemyAction)){
                    return string2Int(myAction) + 6;
                } else if (3 == string2Int(ennemyAction)){
                    return string2Int(myAction) + 3;
                }
                return string2Int(myAction) + 0;       
            default :
            return 0;
        }
    }

    public static int string2Int(char s) {
        switch (s) {
            case 'A' :
            case 'X' :
                return 1;
            case 'B':
            case 'Y' :
                return 2;
            case 'C':
            case 'Z' :
                return 3;
            default : 
                return 0;
        }
    }
}
