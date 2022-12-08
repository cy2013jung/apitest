package com.hanwha.neo.branch.ss.org.service;

public class NeoOrgWsProxy implements com.hanwha.neo.branch.ss.org.service.NeoOrgWs {
  private String _endpoint = null;
  private com.hanwha.neo.branch.ss.org.service.NeoOrgWs neoOrgWs = null;
  
  public NeoOrgWsProxy() {
    _initNeoOrgWsProxy();
  }
  
  public NeoOrgWsProxy(String endpoint) {
    _endpoint = endpoint;
    _initNeoOrgWsProxy();
  }
  
  private void _initNeoOrgWsProxy() {
    try {
      neoOrgWs = (new com.hanwha.neo.branch.ss.org.service.NeoOrgWsImplServiceLocator()).getNeoOrgWsImplPort();
      if (neoOrgWs != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)neoOrgWs)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)neoOrgWs)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (neoOrgWs != null)
      ((javax.xml.rpc.Stub)neoOrgWs)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.hanwha.neo.branch.ss.org.service.NeoOrgWs getNeoOrgWs() {
    if (neoOrgWs == null)
      _initNeoOrgWsProxy();
    return neoOrgWs;
  }
  
  public com.hanwha.neo.branch.ss.org.vo.OrgDeptVO[] searchDeptByDeptIdIncludeChild(java.lang.String deptId) throws java.rmi.RemoteException{
    if (neoOrgWs == null)
      _initNeoOrgWsProxy();
    return neoOrgWs.searchDeptByDeptIdIncludeChild(deptId);
  }
  
  public com.hanwha.neo.branch.ss.org.vo.OrgUserVO searchDefaultUserByUserId(java.lang.String userId) throws java.rmi.RemoteException{
    if (neoOrgWs == null)
      _initNeoOrgWsProxy();
    return neoOrgWs.searchDefaultUserByUserId(userId);
  }
  
  public com.hanwha.neo.branch.ss.org.vo.OrgDeptVO[] searchDeptByDeptName(java.lang.String deptName) throws java.rmi.RemoteException{
    if (neoOrgWs == null)
      _initNeoOrgWsProxy();
    return neoOrgWs.searchDeptByDeptName(deptName);
  }
  
  public com.hanwha.neo.branch.ss.org.vo.OrgCodeVO[] getOrgClassList() throws java.rmi.RemoteException{
    if (neoOrgWs == null)
      _initNeoOrgWsProxy();
    return neoOrgWs.getOrgClassList();
  }
  
  public com.hanwha.neo.branch.ss.org.vo.OrgUserVO[] searchUserByOrgFunctionId(java.lang.String orgFunctionId) throws java.rmi.RemoteException{
    if (neoOrgWs == null)
      _initNeoOrgWsProxy();
    return neoOrgWs.searchUserByOrgFunctionId(orgFunctionId);
  }
  
  public com.hanwha.neo.branch.ss.org.vo.OrgUserVO[] searchUserByUserKey(java.lang.String userKey) throws java.rmi.RemoteException{
    if (neoOrgWs == null)
      _initNeoOrgWsProxy();
    return neoOrgWs.searchUserByUserKey(userKey);
  }
  
  public com.hanwha.neo.branch.ss.org.vo.OrgUserVO[] searchUserByOrgClassId(java.lang.String orgClassId) throws java.rmi.RemoteException{
    if (neoOrgWs == null)
      _initNeoOrgWsProxy();
    return neoOrgWs.searchUserByOrgClassId(orgClassId);
  }
  
  public com.hanwha.neo.branch.ss.org.vo.OrgDeptVO[] searchDeptByCompanyIdForPaging(int pageNo, int pageSize) throws java.rmi.RemoteException{
    if (neoOrgWs == null)
      _initNeoOrgWsProxy();
    return neoOrgWs.searchDeptByCompanyIdForPaging(pageNo, pageSize);
  }
  
  public com.hanwha.neo.branch.ss.org.vo.OrgDeptVO[] searchDeptByCompanyId() throws java.rmi.RemoteException{
    if (neoOrgWs == null)
      _initNeoOrgWsProxy();
    return neoOrgWs.searchDeptByCompanyId();
  }
  
  public com.hanwha.neo.branch.ss.org.vo.OrgUserVO[] searchUserByEmpolyeeNo(java.lang.String employeeNo) throws java.rmi.RemoteException{
    if (neoOrgWs == null)
      _initNeoOrgWsProxy();
    return neoOrgWs.searchUserByEmpolyeeNo(employeeNo);
  }
  
  public com.hanwha.neo.branch.ss.org.vo.OrgUserVO[] searchUserByDeptIdForPaging(java.lang.String deptId, int pageNo, int pageSize) throws java.rmi.RemoteException{
    if (neoOrgWs == null)
      _initNeoOrgWsProxy();
    return neoOrgWs.searchUserByDeptIdForPaging(deptId, pageNo, pageSize);
  }
  
  public com.hanwha.neo.branch.ss.org.vo.OrgUserVO[] searchUserByMailList(java.lang.String[] email) throws java.rmi.RemoteException{
    if (neoOrgWs == null)
      _initNeoOrgWsProxy();
    return neoOrgWs.searchUserByMailList(email);
  }
  
  public com.hanwha.neo.branch.ss.org.vo.OrgCodeVO[] getOrgPositionList() throws java.rmi.RemoteException{
    if (neoOrgWs == null)
      _initNeoOrgWsProxy();
    return neoOrgWs.getOrgPositionList();
  }
  
  public com.hanwha.neo.branch.ss.org.vo.OrgUserVOForTeams[] searchUserByDeptIdWithVisible(java.lang.String deptId, java.lang.String[] visibleType, java.lang.Boolean activeFlag) throws java.rmi.RemoteException{
    if (neoOrgWs == null)
      _initNeoOrgWsProxy();
    return neoOrgWs.searchUserByDeptIdWithVisible(deptId, visibleType, activeFlag);
  }
  
  public com.hanwha.neo.branch.ss.org.vo.OrgUserVO[] searchUserByOrgPositionId(java.lang.String orgPositionId) throws java.rmi.RemoteException{
    if (neoOrgWs == null)
      _initNeoOrgWsProxy();
    return neoOrgWs.searchUserByOrgPositionId(orgPositionId);
  }
  
  public com.hanwha.neo.branch.ss.org.vo.OrgUserVO[] searchUserByDeptId(java.lang.String deptId) throws java.rmi.RemoteException{
    if (neoOrgWs == null)
      _initNeoOrgWsProxy();
    return neoOrgWs.searchUserByDeptId(deptId);
  }
  
  public com.hanwha.neo.branch.ss.org.vo.OrgDeptVO[] searchDeptByDeptId(java.lang.String deptId) throws java.rmi.RemoteException{
    if (neoOrgWs == null)
      _initNeoOrgWsProxy();
    return neoOrgWs.searchDeptByDeptId(deptId);
  }
  
  public com.hanwha.neo.branch.ss.org.vo.OrgUserVO[] searchUserByUserIdList(java.lang.String[] userId) throws java.rmi.RemoteException{
    if (neoOrgWs == null)
      _initNeoOrgWsProxy();
    return neoOrgWs.searchUserByUserIdList(userId);
  }
  
  public com.hanwha.neo.branch.ss.org.vo.OrgUserVOForTeams[] searchUserByDeptIdWithVisibleAll(java.lang.String deptId) throws java.rmi.RemoteException{
    if (neoOrgWs == null)
      _initNeoOrgWsProxy();
    return neoOrgWs.searchUserByDeptIdWithVisibleAll(deptId);
  }
  
  public com.hanwha.neo.branch.ss.org.vo.OrgUserVO[] searchUserByMail(java.lang.String email) throws java.rmi.RemoteException{
    if (neoOrgWs == null)
      _initNeoOrgWsProxy();
    return neoOrgWs.searchUserByMail(email);
  }
  
  public com.hanwha.neo.branch.ss.org.vo.OrgUserVO[] searchUserByUserName(java.lang.String userName) throws java.rmi.RemoteException{
    if (neoOrgWs == null)
      _initNeoOrgWsProxy();
    return neoOrgWs.searchUserByUserName(userName);
  }
  
  public com.hanwha.neo.branch.ss.org.vo.OrgUserVO[] searchUserByUserId(java.lang.String userId) throws java.rmi.RemoteException{
    if (neoOrgWs == null)
      _initNeoOrgWsProxy();
    return neoOrgWs.searchUserByUserId(userId);
  }
  
  public com.hanwha.neo.branch.ss.org.vo.OrgUserVO[] searchUserByUserKeyList(java.lang.String[] userKey) throws java.rmi.RemoteException{
    if (neoOrgWs == null)
      _initNeoOrgWsProxy();
    return neoOrgWs.searchUserByUserKeyList(userKey);
  }
  
  public com.hanwha.neo.branch.ss.org.vo.OrgCodeVO[] getOrgFunctionList() throws java.rmi.RemoteException{
    if (neoOrgWs == null)
      _initNeoOrgWsProxy();
    return neoOrgWs.getOrgFunctionList();
  }
  
  
}