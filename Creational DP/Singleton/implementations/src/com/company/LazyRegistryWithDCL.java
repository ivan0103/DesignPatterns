package com.company;

/**
 * This class demonstrates singleton pattern using Double Checked Locking or "classic" singleton.
 * This is also a lazy initializing singleton.
 * Although this implementation solves the multi-threading issue with lazy initialization using volatile
 * and double check locking, the volatile keyword is guaranteed to work only after JVMs starting with
 * version 1.5 and later.
 */
public class LazyRegistryWithDCL {

    private LazyRegistryWithDCL() {

    }

    private static volatile LazyRegistryWithDCL INSTANCE;

    /*
    Volatile forces value read/write from main memory instead of cache.
     */
    public static LazyRegistryWithDCL getInstance() {
        if (INSTANCE == null) {
            //In case two threads access this class.
            synchronized (LazyRegistryWithDCL.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazyRegistryWithDCL();
                }
                else {
                    return INSTANCE;
                }
            }
        }
        return INSTANCE;
    }
 
}
