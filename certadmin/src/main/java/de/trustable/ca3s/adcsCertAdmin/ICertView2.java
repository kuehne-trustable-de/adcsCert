
package de.trustable.ca3s.adcsCertAdmin;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * ICertView2 Interface
 *
 * <p>uuid({D594B282-8851-4B61-9C66-3EDADF848863})</p>
 */
@ComInterface(iid="{D594B282-8851-4B61-9C66-3EDADF848863}")
public interface ICertView2 extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param strConfig [in] {@code String}
     */
    @ComMethod(name = "OpenConnection", dispId = 0x60020000)
    void OpenConnection(String strConfig);
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     * @param fResultColumn [in] {@code Integer}
     */
    @ComMethod(name = "EnumCertViewColumn", dispId = 0x60020001)
    IEnumCERTVIEWCOLUMN EnumCertViewColumn(Integer fResultColumn);
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     * @param fResultColumn [in] {@code Integer}
     */
    @ComMethod(name = "GetColumnCount", dispId = 0x60020002)
    Integer GetColumnCount(Integer fResultColumn);
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(10)</p>
     * @param fResultColumn [in] {@code Integer}
     * @param strColumnName [in] {@code String}
     */
    @ComMethod(name = "GetColumnIndex", dispId = 0x60020003)
    Integer GetColumnIndex(Integer fResultColumn,
            String strColumnName);
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(11)</p>
     * @param cResultColumn [in] {@code Integer}
     */
    @ComMethod(name = "SetResultColumnCount", dispId = 0x60020004)
    void SetResultColumnCount(Integer cResultColumn);
            
    /**
     * <p>id(0x60020005)</p>
     * <p>vtableId(12)</p>
     * @param ColumnIndex [in] {@code Integer}
     */
    @ComMethod(name = "SetResultColumn", dispId = 0x60020005)
    void SetResultColumn(Integer ColumnIndex);
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(13)</p>
     * @param ColumnIndex [in] {@code Integer}
     * @param SeekOperator [in] {@code Integer}
     * @param SortOrder [in] {@code Integer}
     * @param pvarValue [in] {@code Object}
     */
    @ComMethod(name = "SetRestriction", dispId = 0x60020006)
    void SetRestriction(Integer ColumnIndex,
            Integer SeekOperator,
            Integer SortOrder,
            Object pvarValue);
            
    /**
     * <p>id(0x60020007)</p>
     * <p>vtableId(14)</p>
     */
    @ComMethod(name = "OpenView", dispId = 0x60020007)
    IEnumCERTVIEWROW OpenView();
            
    /**
     * <p>id(0x60030000)</p>
     * <p>vtableId(15)</p>
     * @param Table [in] {@code Integer}
     */
    @ComMethod(name = "SetTable", dispId = 0x60030000)
    void SetTable(Integer Table);
            
    
}