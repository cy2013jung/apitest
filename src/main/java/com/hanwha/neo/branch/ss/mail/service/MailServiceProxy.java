package com.hanwha.neo.branch.ss.mail.service;

public class MailServiceProxy implements com.hanwha.neo.branch.ss.mail.service.MailService {
  private String _endpoint = null;
  private com.hanwha.neo.branch.ss.mail.service.MailService mailService = null;
  
  public MailServiceProxy() {
    _initMailServiceProxy();
  }
  
  public MailServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initMailServiceProxy();
  }
  
  private void _initMailServiceProxy() {
    try {
      mailService = (new com.hanwha.neo.branch.ss.mail.service.MailServiceServiceLocator()).getMailService();
      if (mailService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)mailService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)mailService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (mailService != null)
      ((javax.xml.rpc.Stub)mailService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.hanwha.neo.branch.ss.mail.service.MailService getMailService() {
    if (mailService == null)
      _initMailServiceProxy();
    return mailService;
  }
  
  public com.hanwha.neo.branch.ss.mail.vo.WsMailStatus[] getMailStatusCounts(java.lang.String[] mailKey) throws java.rmi.RemoteException, com.hanwha.neo.branch.ss.common.vo.WsException{
    if (mailService == null)
      _initMailServiceProxy();
    return mailService.getMailStatusCounts(mailKey);
  }
  
  public java.lang.String cancelMISMailByRecipient(java.lang.String mailKey, java.lang.String[] receiverForCancel, com.hanwha.neo.branch.ss.mail.vo.WsResource senderInfo) throws java.rmi.RemoteException, com.hanwha.neo.branch.ss.common.vo.WsException{
    if (mailService == null)
      _initMailServiceProxy();
    return mailService.cancelMISMailByRecipient(mailKey, receiverForCancel, senderInfo);
  }
  
  public java.lang.String sendMISMail(java.lang.String mailBody, com.hanwha.neo.branch.ss.mail.vo.WsMailInfo mailInfo, com.hanwha.neo.branch.ss.mail.vo.WsRecipient[] receivers, com.hanwha.neo.branch.ss.common.vo.WsAttachFile[] attachFile) throws java.rmi.RemoteException, com.hanwha.neo.branch.ss.common.vo.WsException{
    if (mailService == null)
      _initMailServiceProxy();
    return mailService.sendMISMail(mailBody, mailInfo, receivers, attachFile);
  }
  
  public java.lang.String sendMISSchedule(java.lang.String mailBody, com.hanwha.neo.branch.ss.mail.vo.WsScheduleInfo scheduleInfo) throws java.rmi.RemoteException, com.hanwha.neo.branch.ss.common.vo.WsException{
    if (mailService == null)
      _initMailServiceProxy();
    return mailService.sendMISSchedule(mailBody, scheduleInfo);
  }
  
  
}