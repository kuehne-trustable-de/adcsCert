
package de.trustable.ca3s.adcsCertEnrol;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * Object Identifier Interface
 *
 * <p>uuid({728AB300-217D-11DA-B2A4-000E7BBB2B09})</p>
 */
@ComInterface(iid="{728AB300-217D-11DA-B2A4-000E7BBB2B09}")
public interface IObjectId extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param Name [in] {@code CERTENROLL_OBJECTID}
     */
    @ComMethod(name = "InitializeFromName", dispId = 0x60020000)
    void InitializeFromName(CERTENROLL_OBJECTID Name);
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     * @param strValue [in] {@code String}
     */
    @ComMethod(name = "InitializeFromValue", dispId = 0x60020001)
    void InitializeFromValue(String strValue);
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     * @param GroupId [in] {@code ObjectIdGroupId}
     * @param KeyFlags [in] {@code ObjectIdPublicKeyFlags}
     * @param AlgFlags [in] {@code AlgorithmFlags}
     * @param strAlgorithmName [in] {@code String}
     */
    @ComMethod(name = "InitializeFromAlgorithmName", dispId = 0x60020002)
    void InitializeFromAlgorithmName(ObjectIdGroupId GroupId,
            ObjectIdPublicKeyFlags KeyFlags,
            AlgorithmFlags AlgFlags,
            String strAlgorithmName);
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Name", dispId = 0x60020003)
    CERTENROLL_OBJECTID getName();
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "FriendlyName", dispId = 0x60020004)
    String getFriendlyName();
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "FriendlyName", dispId = 0x60020004)
    void setFriendlyName(String param0);
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Value", dispId = 0x60020006)
    String getValue();
            
    /**
     * <p>id(0x60020007)</p>
     * <p>vtableId(14)</p>
     * @param GroupId [in] {@code ObjectIdGroupId}
     * @param KeyFlags [in] {@code ObjectIdPublicKeyFlags}
     */
    @ComMethod(name = "GetAlgorithmName", dispId = 0x60020007)
    String GetAlgorithmName(ObjectIdGroupId GroupId,
            ObjectIdPublicKeyFlags KeyFlags);
            
    
}