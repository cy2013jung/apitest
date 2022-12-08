/**
 * NeoOrgWsImplServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hanwha.neo.branch.ss.org.service;

public class NeoOrgWsImplServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.hanwha.neo.branch.ss.org.service.NeoOrgWs {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[24];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchDeptByDeptIdIncludeChild");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "deptId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "ArrayOfOrgDeptVO"));
        oper.setReturnClass(com.hanwha.neo.branch.ss.org.vo.OrgDeptVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "OrgDeptVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchDefaultUserByUserId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "userId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "OrgUserVO"));
        oper.setReturnClass(com.hanwha.neo.branch.ss.org.vo.OrgUserVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchDeptByDeptName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "deptName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "ArrayOfOrgDeptVO"));
        oper.setReturnClass(com.hanwha.neo.branch.ss.org.vo.OrgDeptVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "OrgDeptVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getOrgClassList");
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "ArrayOfOrgCodeVO"));
        oper.setReturnClass(com.hanwha.neo.branch.ss.org.vo.OrgCodeVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "OrgCodeVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchUserByOrgFunctionId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "orgFunctionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "ArrayOfOrgUserVO"));
        oper.setReturnClass(com.hanwha.neo.branch.ss.org.vo.OrgUserVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "OrgUserVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchUserByOrgClassId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "orgClassId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "ArrayOfOrgUserVO"));
        oper.setReturnClass(com.hanwha.neo.branch.ss.org.vo.OrgUserVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "OrgUserVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchUserByUserKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "userKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "ArrayOfOrgUserVO"));
        oper.setReturnClass(com.hanwha.neo.branch.ss.org.vo.OrgUserVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "OrgUserVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchDeptByCompanyId");
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "ArrayOfOrgDeptVO"));
        oper.setReturnClass(com.hanwha.neo.branch.ss.org.vo.OrgDeptVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "OrgDeptVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchDeptByCompanyIdForPaging");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "pageNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "pageSize"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "ArrayOfOrgDeptVO"));
        oper.setReturnClass(com.hanwha.neo.branch.ss.org.vo.OrgDeptVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "OrgDeptVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchUserByEmpolyeeNo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "employeeNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "ArrayOfOrgUserVO"));
        oper.setReturnClass(com.hanwha.neo.branch.ss.org.vo.OrgUserVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "OrgUserVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchUserByDeptIdForPaging");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "deptId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "pageNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "pageSize"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "ArrayOfOrgUserVO"));
        oper.setReturnClass(com.hanwha.neo.branch.ss.org.vo.OrgUserVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "OrgUserVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getOrgPositionList");
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "ArrayOfOrgCodeVO"));
        oper.setReturnClass(com.hanwha.neo.branch.ss.org.vo.OrgCodeVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "OrgCodeVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchUserByMailList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "email"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "ArrayOfString"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "string"));
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "ArrayOfOrgUserVO"));
        oper.setReturnClass(com.hanwha.neo.branch.ss.org.vo.OrgUserVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "OrgUserVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchUserByDeptIdWithVisible");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "deptId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "visibleType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "ArrayOfString"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "string"));
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "activeFlag"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), java.lang.Boolean.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "ArrayOfOrgUserVOForTeams"));
        oper.setReturnClass(com.hanwha.neo.branch.ss.org.vo.OrgUserVOForTeams[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "OrgUserVOForTeams"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchUserByOrgPositionId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "orgPositionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "ArrayOfOrgUserVO"));
        oper.setReturnClass(com.hanwha.neo.branch.ss.org.vo.OrgUserVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "OrgUserVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchUserByDeptId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "deptId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "ArrayOfOrgUserVO"));
        oper.setReturnClass(com.hanwha.neo.branch.ss.org.vo.OrgUserVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "OrgUserVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchDeptByDeptId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "deptId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "ArrayOfOrgDeptVO"));
        oper.setReturnClass(com.hanwha.neo.branch.ss.org.vo.OrgDeptVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "OrgDeptVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchUserByUserIdList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "userId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "ArrayOfString"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "string"));
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "ArrayOfOrgUserVO"));
        oper.setReturnClass(com.hanwha.neo.branch.ss.org.vo.OrgUserVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "OrgUserVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchUserByDeptIdWithVisibleAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "deptId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "ArrayOfOrgUserVOForTeams"));
        oper.setReturnClass(com.hanwha.neo.branch.ss.org.vo.OrgUserVOForTeams[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "OrgUserVOForTeams"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchUserByMail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "email"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "ArrayOfOrgUserVO"));
        oper.setReturnClass(com.hanwha.neo.branch.ss.org.vo.OrgUserVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "OrgUserVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchUserByUserName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "ArrayOfOrgUserVO"));
        oper.setReturnClass(com.hanwha.neo.branch.ss.org.vo.OrgUserVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "OrgUserVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchUserByUserId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "userId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "ArrayOfOrgUserVO"));
        oper.setReturnClass(com.hanwha.neo.branch.ss.org.vo.OrgUserVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "OrgUserVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchUserByUserKeyList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "userKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "ArrayOfString"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "string"));
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "ArrayOfOrgUserVO"));
        oper.setReturnClass(com.hanwha.neo.branch.ss.org.vo.OrgUserVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "OrgUserVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getOrgFunctionList");
        oper.setReturnType(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "ArrayOfOrgCodeVO"));
        oper.setReturnClass(com.hanwha.neo.branch.ss.org.vo.OrgCodeVO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "OrgCodeVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

    }

    public NeoOrgWsImplServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public NeoOrgWsImplServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public NeoOrgWsImplServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "string");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "ArrayOfOrgCodeVO");
            cachedSerQNames.add(qName);
            cls = com.hanwha.neo.branch.ss.org.vo.OrgCodeVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "OrgCodeVO");
            qName2 = new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "OrgCodeVO");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "ArrayOfOrgDeptVO");
            cachedSerQNames.add(qName);
            cls = com.hanwha.neo.branch.ss.org.vo.OrgDeptVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "OrgDeptVO");
            qName2 = new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "OrgDeptVO");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "ArrayOfOrgUserVO");
            cachedSerQNames.add(qName);
            cls = com.hanwha.neo.branch.ss.org.vo.OrgUserVO[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "OrgUserVO");
            qName2 = new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "OrgUserVO");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "ArrayOfOrgUserVOForTeams");
            cachedSerQNames.add(qName);
            cls = com.hanwha.neo.branch.ss.org.vo.OrgUserVOForTeams[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "OrgUserVOForTeams");
            qName2 = new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "OrgUserVOForTeams");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "OrgCodeVO");
            cachedSerQNames.add(qName);
            cls = com.hanwha.neo.branch.ss.org.vo.OrgCodeVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "OrgDeptVO");
            cachedSerQNames.add(qName);
            cls = com.hanwha.neo.branch.ss.org.vo.OrgDeptVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "OrgUserVO");
            cachedSerQNames.add(qName);
            cls = com.hanwha.neo.branch.ss.org.vo.OrgUserVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vo.org.ss.branch.neo.hanwha", "OrgUserVOForTeams");
            cachedSerQNames.add(qName);
            cls = com.hanwha.neo.branch.ss.org.vo.OrgUserVOForTeams.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.hanwha.neo.branch.ss.org.vo.OrgDeptVO[] searchDeptByDeptIdIncludeChild(java.lang.String deptId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "searchDeptByDeptIdIncludeChild"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deptId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hanwha.neo.branch.ss.org.vo.OrgDeptVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hanwha.neo.branch.ss.org.vo.OrgDeptVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.hanwha.neo.branch.ss.org.vo.OrgDeptVO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hanwha.neo.branch.ss.org.vo.OrgUserVO searchDefaultUserByUserId(java.lang.String userId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "searchDefaultUserByUserId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hanwha.neo.branch.ss.org.vo.OrgUserVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hanwha.neo.branch.ss.org.vo.OrgUserVO) org.apache.axis.utils.JavaUtils.convert(_resp, com.hanwha.neo.branch.ss.org.vo.OrgUserVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hanwha.neo.branch.ss.org.vo.OrgDeptVO[] searchDeptByDeptName(java.lang.String deptName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "searchDeptByDeptName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deptName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hanwha.neo.branch.ss.org.vo.OrgDeptVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hanwha.neo.branch.ss.org.vo.OrgDeptVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.hanwha.neo.branch.ss.org.vo.OrgDeptVO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hanwha.neo.branch.ss.org.vo.OrgCodeVO[] getOrgClassList() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "getOrgClassList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hanwha.neo.branch.ss.org.vo.OrgCodeVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hanwha.neo.branch.ss.org.vo.OrgCodeVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.hanwha.neo.branch.ss.org.vo.OrgCodeVO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hanwha.neo.branch.ss.org.vo.OrgUserVO[] searchUserByOrgFunctionId(java.lang.String orgFunctionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "searchUserByOrgFunctionId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {orgFunctionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hanwha.neo.branch.ss.org.vo.OrgUserVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hanwha.neo.branch.ss.org.vo.OrgUserVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.hanwha.neo.branch.ss.org.vo.OrgUserVO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hanwha.neo.branch.ss.org.vo.OrgUserVO[] searchUserByOrgClassId(java.lang.String orgClassId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "searchUserByOrgClassId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {orgClassId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hanwha.neo.branch.ss.org.vo.OrgUserVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hanwha.neo.branch.ss.org.vo.OrgUserVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.hanwha.neo.branch.ss.org.vo.OrgUserVO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hanwha.neo.branch.ss.org.vo.OrgUserVO[] searchUserByUserKey(java.lang.String userKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "searchUserByUserKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hanwha.neo.branch.ss.org.vo.OrgUserVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hanwha.neo.branch.ss.org.vo.OrgUserVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.hanwha.neo.branch.ss.org.vo.OrgUserVO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hanwha.neo.branch.ss.org.vo.OrgDeptVO[] searchDeptByCompanyId() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "searchDeptByCompanyId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hanwha.neo.branch.ss.org.vo.OrgDeptVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hanwha.neo.branch.ss.org.vo.OrgDeptVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.hanwha.neo.branch.ss.org.vo.OrgDeptVO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hanwha.neo.branch.ss.org.vo.OrgDeptVO[] searchDeptByCompanyIdForPaging(int pageNo, int pageSize) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "searchDeptByCompanyIdForPaging"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(pageNo), new java.lang.Integer(pageSize)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hanwha.neo.branch.ss.org.vo.OrgDeptVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hanwha.neo.branch.ss.org.vo.OrgDeptVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.hanwha.neo.branch.ss.org.vo.OrgDeptVO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hanwha.neo.branch.ss.org.vo.OrgUserVO[] searchUserByEmpolyeeNo(java.lang.String employeeNo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "searchUserByEmpolyeeNo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {employeeNo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hanwha.neo.branch.ss.org.vo.OrgUserVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hanwha.neo.branch.ss.org.vo.OrgUserVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.hanwha.neo.branch.ss.org.vo.OrgUserVO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hanwha.neo.branch.ss.org.vo.OrgUserVO[] searchUserByDeptIdForPaging(java.lang.String deptId, int pageNo, int pageSize) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "searchUserByDeptIdForPaging"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deptId, new java.lang.Integer(pageNo), new java.lang.Integer(pageSize)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hanwha.neo.branch.ss.org.vo.OrgUserVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hanwha.neo.branch.ss.org.vo.OrgUserVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.hanwha.neo.branch.ss.org.vo.OrgUserVO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hanwha.neo.branch.ss.org.vo.OrgCodeVO[] getOrgPositionList() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "getOrgPositionList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hanwha.neo.branch.ss.org.vo.OrgCodeVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hanwha.neo.branch.ss.org.vo.OrgCodeVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.hanwha.neo.branch.ss.org.vo.OrgCodeVO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hanwha.neo.branch.ss.org.vo.OrgUserVO[] searchUserByMailList(java.lang.String[] email) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "searchUserByMailList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {email});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hanwha.neo.branch.ss.org.vo.OrgUserVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hanwha.neo.branch.ss.org.vo.OrgUserVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.hanwha.neo.branch.ss.org.vo.OrgUserVO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hanwha.neo.branch.ss.org.vo.OrgUserVOForTeams[] searchUserByDeptIdWithVisible(java.lang.String deptId, java.lang.String[] visibleType, java.lang.Boolean activeFlag) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "searchUserByDeptIdWithVisible"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deptId, visibleType, activeFlag});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hanwha.neo.branch.ss.org.vo.OrgUserVOForTeams[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hanwha.neo.branch.ss.org.vo.OrgUserVOForTeams[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.hanwha.neo.branch.ss.org.vo.OrgUserVOForTeams[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hanwha.neo.branch.ss.org.vo.OrgUserVO[] searchUserByOrgPositionId(java.lang.String orgPositionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "searchUserByOrgPositionId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {orgPositionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hanwha.neo.branch.ss.org.vo.OrgUserVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hanwha.neo.branch.ss.org.vo.OrgUserVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.hanwha.neo.branch.ss.org.vo.OrgUserVO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hanwha.neo.branch.ss.org.vo.OrgUserVO[] searchUserByDeptId(java.lang.String deptId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "searchUserByDeptId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deptId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hanwha.neo.branch.ss.org.vo.OrgUserVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hanwha.neo.branch.ss.org.vo.OrgUserVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.hanwha.neo.branch.ss.org.vo.OrgUserVO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hanwha.neo.branch.ss.org.vo.OrgDeptVO[] searchDeptByDeptId(java.lang.String deptId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "searchDeptByDeptId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deptId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hanwha.neo.branch.ss.org.vo.OrgDeptVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hanwha.neo.branch.ss.org.vo.OrgDeptVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.hanwha.neo.branch.ss.org.vo.OrgDeptVO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hanwha.neo.branch.ss.org.vo.OrgUserVO[] searchUserByUserIdList(java.lang.String[] userId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "searchUserByUserIdList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hanwha.neo.branch.ss.org.vo.OrgUserVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hanwha.neo.branch.ss.org.vo.OrgUserVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.hanwha.neo.branch.ss.org.vo.OrgUserVO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hanwha.neo.branch.ss.org.vo.OrgUserVOForTeams[] searchUserByDeptIdWithVisibleAll(java.lang.String deptId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "searchUserByDeptIdWithVisibleAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deptId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hanwha.neo.branch.ss.org.vo.OrgUserVOForTeams[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hanwha.neo.branch.ss.org.vo.OrgUserVOForTeams[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.hanwha.neo.branch.ss.org.vo.OrgUserVOForTeams[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hanwha.neo.branch.ss.org.vo.OrgUserVO[] searchUserByMail(java.lang.String email) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "searchUserByMail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {email});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hanwha.neo.branch.ss.org.vo.OrgUserVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hanwha.neo.branch.ss.org.vo.OrgUserVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.hanwha.neo.branch.ss.org.vo.OrgUserVO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hanwha.neo.branch.ss.org.vo.OrgUserVO[] searchUserByUserName(java.lang.String userName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "searchUserByUserName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hanwha.neo.branch.ss.org.vo.OrgUserVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hanwha.neo.branch.ss.org.vo.OrgUserVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.hanwha.neo.branch.ss.org.vo.OrgUserVO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hanwha.neo.branch.ss.org.vo.OrgUserVO[] searchUserByUserId(java.lang.String userId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "searchUserByUserId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hanwha.neo.branch.ss.org.vo.OrgUserVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hanwha.neo.branch.ss.org.vo.OrgUserVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.hanwha.neo.branch.ss.org.vo.OrgUserVO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hanwha.neo.branch.ss.org.vo.OrgUserVO[] searchUserByUserKeyList(java.lang.String[] userKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "searchUserByUserKeyList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hanwha.neo.branch.ss.org.vo.OrgUserVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hanwha.neo.branch.ss.org.vo.OrgUserVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.hanwha.neo.branch.ss.org.vo.OrgUserVO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.hanwha.neo.branch.ss.org.vo.OrgCodeVO[] getOrgFunctionList() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.org.ss.branch.neo.hanwha/", "getOrgFunctionList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.hanwha.neo.branch.ss.org.vo.OrgCodeVO[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.hanwha.neo.branch.ss.org.vo.OrgCodeVO[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.hanwha.neo.branch.ss.org.vo.OrgCodeVO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
