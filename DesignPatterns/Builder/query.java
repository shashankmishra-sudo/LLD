package DesignPatterns.Builder;

public class query {
    private String databaseUrl;
    private String username;
    private String password;
    private int maxConnections;
    private boolean enableCache;
    private boolean isReadOnly;

    public void setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMaxConnections(int maxConnections) {
        this.maxConnections = maxConnections;
    }

    public void setEnableCache(boolean enableCache) {
        this.enableCache = enableCache;
    }

    public void setReadOnly(boolean readOnly) {
        isReadOnly = readOnly;
    }
}
