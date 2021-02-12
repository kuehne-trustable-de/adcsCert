
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * Csp Algorithm Interface
 *
 * <p>uuid({728AB305-217D-11DA-B2A4-000E7BBB2B09})</p>
 */
@ComInterface(iid="{728AB305-217D-11DA-B2A4-000E7BBB2B09}")
public interface ICspAlgorithm extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param Length [in] {@code Integer}
     * @param AlgFlags [in] {@code AlgorithmFlags}
     */
    @ComMethod(name = "GetAlgorithmOid", dispId = 0x60020000)
    IObjectId GetAlgorithmOid(Integer Length,
            AlgorithmFlags AlgFlags);
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "DefaultLength", dispId = 0x60020001)
    Integer getDefaultLength();
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "IncrementLength", dispId = 0x60020002)
    Integer getIncrementLength();
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "LongName", dispId = 0x60020003)
    String getLongName();
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Valid", dispId = 0x60020004)
    Boolean getValid();
            
    /**
     * <p>id(0x60020005)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "MaxLength", dispId = 0x60020005)
    Integer getMaxLength();
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "MinLength", dispId = 0x60020006)
    Integer getMinLength();
            
    /**
     * <p>id(0x60020007)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Name", dispId = 0x60020007)
    String getName();
            
    /**
     * <p>id(0x60020008)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Type", dispId = 0x60020008)
    AlgorithmType getType();
            
    /**
     * <p>id(0x60020009)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Operations", dispId = 0x60020009)
    AlgorithmOperationFlags getOperations();
            
    
}