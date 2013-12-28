package com.dandelion.memberandroid.dao.auto;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.dandelion.memberandroid.dao.auto.Account;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table ACCOUNT.
*/
public class AccountDao extends AbstractDao<Account, Long> {

    public static final String TABLENAME = "ACCOUNT";

    /**
     * Properties of entity Account.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Sid = new Property(1, String.class, "sid", false, "SID");
        public final static Property Skey = new Property(2, long.class, "skey", false, "SKEY");
        public final static Property UsdId = new Property(3, long.class, "usdId", false, "USD_ID");
        public final static Property AccountType = new Property(4, int.class, "accountType", false, "ACCOUNT_TYPE");
        public final static Property CreatedDate = new Property(5, java.util.Date.class, "createdDate", false, "CREATED_DATE");
        public final static Property ModifyDate = new Property(6, java.util.Date.class, "modifyDate", false, "MODIFY_DATE");
    };


    public AccountDao(DaoConfig config) {
        super(config);
    }
    
    public AccountDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'ACCOUNT' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'SID' TEXT NOT NULL ," + // 1: sid
                "'SKEY' INTEGER NOT NULL ," + // 2: skey
                "'USD_ID' INTEGER NOT NULL ," + // 3: usdId
                "'ACCOUNT_TYPE' INTEGER NOT NULL ," + // 4: accountType
                "'CREATED_DATE' INTEGER NOT NULL ," + // 5: createdDate
                "'MODIFY_DATE' INTEGER NOT NULL );"); // 6: modifyDate
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'ACCOUNT'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Account entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getSid());
        stmt.bindLong(3, entity.getSkey());
        stmt.bindLong(4, entity.getUsdId());
        stmt.bindLong(5, entity.getAccountType());
        stmt.bindLong(6, entity.getCreatedDate().getTime());
        stmt.bindLong(7, entity.getModifyDate().getTime());
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Account readEntity(Cursor cursor, int offset) {
        Account entity = new Account( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // sid
            cursor.getLong(offset + 2), // skey
            cursor.getLong(offset + 3), // usdId
            cursor.getInt(offset + 4), // accountType
            new java.util.Date(cursor.getLong(offset + 5)), // createdDate
            new java.util.Date(cursor.getLong(offset + 6)) // modifyDate
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Account entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setSid(cursor.getString(offset + 1));
        entity.setSkey(cursor.getLong(offset + 2));
        entity.setUsdId(cursor.getLong(offset + 3));
        entity.setAccountType(cursor.getInt(offset + 4));
        entity.setCreatedDate(new java.util.Date(cursor.getLong(offset + 5)));
        entity.setModifyDate(new java.util.Date(cursor.getLong(offset + 6)));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Account entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Account entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
