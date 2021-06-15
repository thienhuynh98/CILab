public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        int countCap = 0;
        int count = 0;
        int countNormal = 0;
        if(myString.charAt(0) >= 'A' && myString.charAt(0) <= 'Z')
        {
            for(int i = 1; i < myString.length(); i++)
            {
                if(myString.charAt(i) >= 'A' && myString.charAt(i) <= 'Z')
                {
                    countCap++;
                }
                if(myString.charAt(i) >= 'a' && myString.charAt(i) <= 'z')
                {
                    count++;
                }
            }
        }
        else
        {
            for(int i = 1; i < myString.length(); i++) {
                if (myString.charAt(i) >= 'a' && myString.charAt(i) <= 'z') {
                    countNormal++;
                }
            }
        }
        if(count == myString.length() - 1 || countCap == myString.length() - 1 || countNormal == myString.length() - 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

