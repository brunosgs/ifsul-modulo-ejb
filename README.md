# Módulo EJB - IFSUL

Este repositório contém um projeto exemplo para o estudo de **Enterprise Java Beans (EJB)**. O projeto demonstra como criar lógica de negócio distribuída e gerenciada pelo servidor de aplicação.

## 🛠️ Tecnologias e Requisitos

* **Java 21 ou superior**
* **Jakarta EE 10**
* **Servidor de Aplicação:** WildFly (38)
* **Build Tool:** Maven

---

## 🔧 Como Importar e Configurar no Eclipse

2.  **Importar no Eclipse:**
    * `File` > `Import...`
    * Escolha `Maven` > `Existing Maven Projects`.
    * Selecione a pasta do projeto clonado.

3.  **Configurar o Runtime (WildFly):**
    * Se o projeto apresentar erros logo após importar, clique com o botão direito no projeto > `Properties`.
    * Vá em `Targeted Runtimes` e marque a sua instância do **WildFly**.
    * Clique em `Apply and Close`.

4.  **Corrigir Facetas (Se necessário):**
    * Se o EJB não for reconhecido, vá em `Properties` > `Project Facets`.
    * Certifique-se de que **Dynamic Web Module** e **Jakarta Enterprise Beans** (ou EJB) estejam marcados.

---

## 📦 Estrutura de Código

Para manter tudo em um único módulo (unificado), o projeto segue este padrão:

* **EJBs:** Localizados em `src/main/java`, utilizando as anotações `@Stateless`, `@Stateful` ou `@Singleton`.
* **JPA (Entidades):** Também em `src/main/java`, configuradas pelo arquivo `src/main/resources/META-INF/persistence.xml`.
* **Web:** Servlets ou JSPs em `src/main/webapp` que injetam os EJBs usando a anotação `@EJB`.

---

## 🚀 Deploy e Execução

1.  Abra a aba **Servers** no Eclipse.
2.  Clique com o botão direito no WildFly configurado > **Add and Remove...**.
3.  Adicione este projeto à lista da direita (**Configured**).
4.  Clique em **Start** (Ícone Verde).

---