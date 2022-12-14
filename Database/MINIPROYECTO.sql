--------------------------------------------------------
-- Archivo creado  - martes-agosto-16-2022   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Sequence SEQ_ID_FUNCIONALIDAD
--------------------------------------------------------

   CREATE SEQUENCE  "MINIPROYECTO"."SEQ_ID_FUNCIONALIDAD"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence SEQ_ID_PERSONA
--------------------------------------------------------

   CREATE SEQUENCE  "MINIPROYECTO"."SEQ_ID_PERSONA"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence SEQ_ID_ROL
--------------------------------------------------------

   CREATE SEQUENCE  "MINIPROYECTO"."SEQ_ID_ROL"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence SEQ_ID_ROL_FUNCION
--------------------------------------------------------

   CREATE SEQUENCE  "MINIPROYECTO"."SEQ_ID_ROL_FUNCION"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Table FUNCIONALIDAD
--------------------------------------------------------

  CREATE TABLE "MINIPROYECTO"."FUNCIONALIDAD" 
   (	"ID_FUNCIONALIDAD" NUMBER(*,0), 
	"NOMBRE" VARCHAR2(50 BYTE), 
	"DESCRIPCION" VARCHAR2(200 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table PERSONA
--------------------------------------------------------

  CREATE TABLE "MINIPROYECTO"."PERSONA" 
   (	"ID_PERSONA" NUMBER(*,0), 
	"DOCUMENTO" NUMBER(*,0), 
	"APELLIDO1" VARCHAR2(50 BYTE), 
	"APELLIDO2" VARCHAR2(50 BYTE), 
	"NOMBRE1" VARCHAR2(50 BYTE), 
	"NOMBRE2" VARCHAR2(50 BYTE), 
	"FECHA_NAC" DATE, 
	"CLAVE" VARCHAR2(20 BYTE), 
	"ID_ROL" NUMBER(*,0), 
	"MAIL" VARCHAR2(40 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table ROL
--------------------------------------------------------

  CREATE TABLE "MINIPROYECTO"."ROL" 
   (	"ID_ROL" NUMBER(*,0), 
	"NOMBRE" VARCHAR2(40 BYTE), 
	"DESCRIPCION" VARCHAR2(200 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table ROL_FUNCION
--------------------------------------------------------

  CREATE TABLE "MINIPROYECTO"."ROL_FUNCION" 
   (	"ID_ROL_FUNCION" NUMBER(*,0), 
	"ID_ROL" NUMBER(*,0), 
	"ID_FUNCION" NUMBER(*,0)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
REM INSERTING into MINIPROYECTO.FUNCIONALIDAD
SET DEFINE OFF;
REM INSERTING into MINIPROYECTO.PERSONA
SET DEFINE OFF;
REM INSERTING into MINIPROYECTO.ROL
SET DEFINE OFF;
REM INSERTING into MINIPROYECTO.ROL_FUNCION
SET DEFINE OFF;
--------------------------------------------------------
--  DDL for Index PK_FUNC
--------------------------------------------------------

  CREATE UNIQUE INDEX "MINIPROYECTO"."PK_FUNC" ON "MINIPROYECTO"."FUNCIONALIDAD" ("ID_FUNCIONALIDAD") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PK_PERSONA
--------------------------------------------------------

  CREATE UNIQUE INDEX "MINIPROYECTO"."PK_PERSONA" ON "MINIPROYECTO"."PERSONA" ("ID_PERSONA") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PK_ROL
--------------------------------------------------------

  CREATE UNIQUE INDEX "MINIPROYECTO"."PK_ROL" ON "MINIPROYECTO"."ROL" ("ID_ROL") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PK_ROL_FUNCION
--------------------------------------------------------

  CREATE UNIQUE INDEX "MINIPROYECTO"."PK_ROL_FUNCION" ON "MINIPROYECTO"."ROL_FUNCION" ("ID_ROL_FUNCION") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index UK_FUNC_NOMBRE
--------------------------------------------------------

  CREATE UNIQUE INDEX "MINIPROYECTO"."UK_FUNC_NOMBRE" ON "MINIPROYECTO"."FUNCIONALIDAD" ("NOMBRE") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index UK_ROL_NOMB
--------------------------------------------------------

  CREATE UNIQUE INDEX "MINIPROYECTO"."UK_ROL_NOMB" ON "MINIPROYECTO"."ROL" ("NOMBRE") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table FUNCIONALIDAD
--------------------------------------------------------

  ALTER TABLE "MINIPROYECTO"."FUNCIONALIDAD" MODIFY ("ID_FUNCIONALIDAD" NOT NULL ENABLE);
  ALTER TABLE "MINIPROYECTO"."FUNCIONALIDAD" MODIFY ("NOMBRE" NOT NULL ENABLE);
  ALTER TABLE "MINIPROYECTO"."FUNCIONALIDAD" MODIFY ("DESCRIPCION" NOT NULL ENABLE);
  ALTER TABLE "MINIPROYECTO"."FUNCIONALIDAD" ADD CONSTRAINT "PK_FUNC" PRIMARY KEY ("ID_FUNCIONALIDAD")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "MINIPROYECTO"."FUNCIONALIDAD" ADD CONSTRAINT "UK_FUNC_NOMBRE" UNIQUE ("NOMBRE")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table ROL_FUNCION
--------------------------------------------------------

  ALTER TABLE "MINIPROYECTO"."ROL_FUNCION" MODIFY ("ID_ROL_FUNCION" NOT NULL ENABLE);
  ALTER TABLE "MINIPROYECTO"."ROL_FUNCION" MODIFY ("ID_ROL" NOT NULL ENABLE);
  ALTER TABLE "MINIPROYECTO"."ROL_FUNCION" MODIFY ("ID_FUNCION" NOT NULL ENABLE);
  ALTER TABLE "MINIPROYECTO"."ROL_FUNCION" ADD CONSTRAINT "PK_ROL_FUNCION" PRIMARY KEY ("ID_ROL_FUNCION")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table PERSONA
--------------------------------------------------------

  ALTER TABLE "MINIPROYECTO"."PERSONA" MODIFY ("ID_PERSONA" NOT NULL ENABLE);
  ALTER TABLE "MINIPROYECTO"."PERSONA" MODIFY ("DOCUMENTO" NOT NULL ENABLE);
  ALTER TABLE "MINIPROYECTO"."PERSONA" MODIFY ("APELLIDO1" NOT NULL ENABLE);
  ALTER TABLE "MINIPROYECTO"."PERSONA" MODIFY ("NOMBRE1" NOT NULL ENABLE);
  ALTER TABLE "MINIPROYECTO"."PERSONA" MODIFY ("FECHA_NAC" NOT NULL ENABLE);
  ALTER TABLE "MINIPROYECTO"."PERSONA" MODIFY ("CLAVE" NOT NULL ENABLE);
  ALTER TABLE "MINIPROYECTO"."PERSONA" MODIFY ("MAIL" NOT NULL ENABLE);
  ALTER TABLE "MINIPROYECTO"."PERSONA" ADD CONSTRAINT "PK_PERSONA" PRIMARY KEY ("ID_PERSONA")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table ROL
--------------------------------------------------------

  ALTER TABLE "MINIPROYECTO"."ROL" MODIFY ("ID_ROL" NOT NULL ENABLE);
  ALTER TABLE "MINIPROYECTO"."ROL" MODIFY ("NOMBRE" NOT NULL ENABLE);
  ALTER TABLE "MINIPROYECTO"."ROL" MODIFY ("DESCRIPCION" NOT NULL ENABLE);
  ALTER TABLE "MINIPROYECTO"."ROL" ADD CONSTRAINT "PK_ROL" PRIMARY KEY ("ID_ROL")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "MINIPROYECTO"."ROL" ADD CONSTRAINT "UK_ROL_NOMB" UNIQUE ("NOMBRE")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table PERSONA
--------------------------------------------------------

  ALTER TABLE "MINIPROYECTO"."PERSONA" ADD CONSTRAINT "FK_PERS_ROL" FOREIGN KEY ("ID_ROL")
	  REFERENCES "MINIPROYECTO"."ROL" ("ID_ROL") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table ROL_FUNCION
--------------------------------------------------------

  ALTER TABLE "MINIPROYECTO"."ROL_FUNCION" ADD CONSTRAINT "FK_ROLFUNC_ROL" FOREIGN KEY ("ID_ROL")
	  REFERENCES "MINIPROYECTO"."ROL" ("ID_ROL") ENABLE;
  ALTER TABLE "MINIPROYECTO"."ROL_FUNCION" ADD CONSTRAINT "FK_ROLFUNC_FUNC" FOREIGN KEY ("ID_FUNCION")
	  REFERENCES "MINIPROYECTO"."FUNCIONALIDAD" ("ID_FUNCIONALIDAD") ENABLE;
