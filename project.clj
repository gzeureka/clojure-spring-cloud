(def SPRING-BOOT-VERSION "2.1.2.RELEASE")

(defproject spring-cloud "0.1.0-SNAPSHOT"
  :description ""
  :dependencies [
                 [org.clojure/clojure "1.10.0"]
                 [org.springframework.boot/spring-boot-starter-web ~SPRING-BOOT-VERSION
                  :exclusions [org.springframework.boot/spring-boot-starter-tomcat]]
                 [org.springframework.boot/spring-boot-starter-jetty ~SPRING-BOOT-VERSION]
                 [org.springframework.boot/spring-boot-starter-actuator ~SPRING-BOOT-VERSION]
                 ;;[org.springframework.boot/spring-boot-loader "1.4.3.RELEASE"]
                 ]
  :repositories [["spring-milestone" "https://repo.spring.io/milestone"]]
  :main org.springframework.boot.loader.JarLauncher
  :manifest {"Start-Class" "spring.cloud.App"
             "Spring-Boot-Classes" "BOOT-INF/classes/"
             "Spring-Boot-Lib" "BOOT-INF/lib/"}
  :libdir-path "target/spring-boot/BOOT-INF/lib"
  :plugins [[lein-libdir "0.1.1"]
            [lein-ancient "0.6.15"]]
  :aot :all)
