# 📦 CSV + Tradução de Produtos

Este projeto foi desenvolvido como atividade prática do curso **"Maven: gerencie dependências de aplicações Java"** da Alura. E demonstra como:

- ✅ **Ler dados de um arquivo CSV**
- ✅ **Traduzir textos de campos usando a API LibreTranslate**
- ✅ **Gerenciar dependências com Maven**

---

## 🚀 **Funcionalidades**
- **Leitura de CSV:** Utiliza a biblioteca [OpenCSV](http://opencsv.sourceforge.net/) para mapear e converter registros do arquivo `.csv` para objetos Java.
- **Tradução Automática:** Integração com a API [LibreTranslate](https://libretranslate.com/) para traduzir automaticamente nome, descrição e categoria dos produtos para outro idioma.
- **Uso de Lombok:** Reduz boilerplate com geração automática de getters, setters e construtores.

---

## 🛠️ **Tecnologias Utilizadas**
- **Java 17**
- **Maven**
- **OpenCSV** (`com.opencsv:opencsv:5.9`)
- **LibreTranslate Java Client** (`net.clojars.suuft:libretranslate-java:1.0.5`)
- **Lombok**

---

📄 **Arquivo CSV de exemplo:** `src/main/resources/products.csv`
Saída no console

Produto(id=223, name=Laptop, description=Powerful laptop for all your computing needs, price=1200, category=Electronics)
Produto(id=442, name=Keyboard, description=High-quality keyboard for seamless typing experience, price=150, category=Electronics)
Produto(id=452, name=Personal Guide, description=Inspirational book for personal development, price=20, category=Books)

---

## ▶️ **Como Executar**
1. Clone o repositório:
   ```bash
   git clone https://github.com/czerbini/<nome-do-repositorio>.git



