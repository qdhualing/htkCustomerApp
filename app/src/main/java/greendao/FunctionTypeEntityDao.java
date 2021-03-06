package greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.hl.htk_customer.greendao.FunctionTypeEntity.FunctionTypeConverter;
import java.util.ArrayList;

import com.hl.htk_customer.greendao.FunctionTypeEntity;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "FUNCTION_TYPE_ENTITY".
*/
public class FunctionTypeEntityDao extends AbstractDao<FunctionTypeEntity, Void> {

    public static final String TABLENAME = "FUNCTION_TYPE_ENTITY";

    /**
     * Properties of entity FunctionTypeEntity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property FunctionList = new Property(0, String.class, "functionList", false, "FUNCTION_LIST");
    }

    private final FunctionTypeConverter functionListConverter = new FunctionTypeConverter();

    public FunctionTypeEntityDao(DaoConfig config) {
        super(config);
    }
    
    public FunctionTypeEntityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"FUNCTION_TYPE_ENTITY\" (" + //
                "\"FUNCTION_LIST\" TEXT);"); // 0: functionList
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"FUNCTION_TYPE_ENTITY\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, FunctionTypeEntity entity) {
        stmt.clearBindings();
 
        ArrayList functionList = entity.getFunctionList();
        if (functionList != null) {
            stmt.bindString(1, functionListConverter.convertToDatabaseValue(functionList));
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, FunctionTypeEntity entity) {
        stmt.clearBindings();
 
        ArrayList functionList = entity.getFunctionList();
        if (functionList != null) {
            stmt.bindString(1, functionListConverter.convertToDatabaseValue(functionList));
        }
    }

    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    @Override
    public FunctionTypeEntity readEntity(Cursor cursor, int offset) {
        FunctionTypeEntity entity = new FunctionTypeEntity( //
            cursor.isNull(offset + 0) ? null : functionListConverter.convertToEntityProperty(cursor.getString(offset + 0)) // functionList
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, FunctionTypeEntity entity, int offset) {
        entity.setFunctionList(cursor.isNull(offset + 0) ? null : functionListConverter.convertToEntityProperty(cursor.getString(offset + 0)));
     }
    
    @Override
    protected final Void updateKeyAfterInsert(FunctionTypeEntity entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    @Override
    public Void getKey(FunctionTypeEntity entity) {
        return null;
    }

    @Override
    public boolean hasKey(FunctionTypeEntity entity) {
        // TODO
        return false;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
