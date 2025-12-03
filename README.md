# 📱 Post Test Praktikum Pemrograman Mobile — Pertemuan 7

> *"Status 200 OK is the heartbeat of a healthy conversation."* 💌

---

## 🧩 Materi
**REST API**

Praktikum ini membahas bagaimana kita menggunakan data dari database menggunakan API.

---

## 👨‍💻 Identitas
| Nama | NIM | Slot | PJ |
|------|-----|------|------|
| Farhan Muhammad Iqbal | 2300018164 | Rabu, 07:0–08:30 | Kak Indri |

---

## ⚙️ Teknologi yang Digunakan
- **Android Studio (Kotlin)**
- **View Binding**
- **Kotlin**
- **Retrofit** Mengambil data dari REST API
- **RecyclerView** (Untuk daftar Story dan Post)
- **Material Components** (Untuk `FAB`, `CardView`, `AlertDialog`)
- **Glide** (Untuk memuat gambar dari URI ke `ImageView`)
- Minimum SDK: 21 (Lollipop)

---

## 🧠 Deskripsi Aplikasi

Aplikasi ini menampilkan daftar Harry Potter Books yang datanya diambil dari REST API.
Ketika pengguna memilih salah satu buku, aplikasi akan membuka halaman Detail Book yang berisi:

- `Cover buku` (menggunakan Glide dari URL)
- `Judul buku`
- `Tanggal rilis`
- `Total halaman`
- `Deskripsi buku` (bisa discroll hingga bawah)

---

## 🚀  Rest API

Menggunakan rest api dari `https://potterapi-fedeperin.vercel.app` dengan susunan data seperti berikut

```
{
  "title": "Harry Potter and the Sorcerer's Stone",
  "releaseDate": "Jun 26, 1997",
  "totalPages": 223,
  "description": "On his birthday, Harry Potter discovers...",
  "imageUrl": "https://.../cover.jpg"
}
```
