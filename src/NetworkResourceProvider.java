public class NetworkResourceProvider {

    private String dbAddress="Localdb/ConfiguationDB.db";
    private String ProxyServer= "127.0.0.0";
    private String lastChangedBy;


    boolean ChangeDbAddress(String newDbAddress, String userName)
    {
        boolean changeSuccessful=false;

        try {
            this.dbAddress = newDbAddress;
            this.lastChangedBy = userName;
            changeSuccessful=true;
        }
        finally {
            return changeSuccessful;
        }

    }

    boolean ChangeProxy(String newProxy, String userName)
    {
        boolean changeSuccessful=false;

        try {
            this.ProxyServer= newProxy;
            this.lastChangedBy = userName;
            changeSuccessful=true;
        }
        finally {
            return changeSuccessful;
        }

    }


    }




