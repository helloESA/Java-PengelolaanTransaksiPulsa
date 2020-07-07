-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 07 Jul 2020 pada 09.23
-- Versi server: 10.4.11-MariaDB
-- Versi PHP: 7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mpt_pulsa`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `kategori`
--

CREATE TABLE `kategori` (
  `id_kategori` int(12) NOT NULL,
  `nama_kategori` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `kategori`
--

INSERT INTO `kategori` (`id_kategori`, `nama_kategori`) VALUES
(6, 'Pulsa Nasional'),
(7, 'Pulsa Transfer'),
(8, 'Gift Telkomsel'),
(9, 'Bulk Telkomsel'),
(10, 'Bulk Digipost'),
(11, 'Kuota Indosat'),
(12, 'Kuota Tri'),
(13, 'Kuota XL'),
(14, 'Kuota AXIS'),
(15, 'Kuota Smartfren'),
(16, 'PLN & E-Money'),
(17, 'Uang Elektronik'),
(18, 'Cetak Vcr Perdana'),
(19, 'E-Commerce'),
(20, 'Game & Digital'),
(21, 'Tagihan PPOB'),
(22, 'Cicilan Bulanan'),
(23, 'TV dan Telepon'),
(24, 'Tagihan PDAM');

-- --------------------------------------------------------

--
-- Struktur dari tabel `produk`
--

CREATE TABLE `produk` (
  `id_produk` int(12) NOT NULL,
  `kategori` varchar(255) NOT NULL,
  `provider` varchar(255) NOT NULL,
  `nama_produk` varchar(50) NOT NULL,
  `keterangan` text NOT NULL,
  `harga` int(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `produk`
--

INSERT INTO `produk` (`id_produk`, `kategori`, `provider`, `nama_produk`, `keterangan`, `harga`) VALUES
(2, 'Pulsa Nasional', 'AXIS', 'AP5', 'Axis Promo 5 Ribu', 5860),
(3, 'Pulsa Nasional', 'AXIS', 'A10', 'Axis 10rb', 10820),
(4, 'Pulsa Nasional', 'AXIS', 'AP10', 'Axis Promo 10 Ribu', 10855),
(5, 'Pulsa Nasional', 'AXIS', 'A15', 'Axis 15rb', 15700),
(6, 'Pulsa Nasional', 'AXIS', 'A25', 'Axis 25rb', 25350),
(7, 'Pulsa Nasional', 'AXIS', 'A30', 'Axis 30rb', 30700),
(8, 'Pulsa Nasional', 'AXIS', 'A50', 'Axis 50rb', 50000),
(9, 'Pulsa Nasional', 'AXIS', 'A100', 'Axis 100rb', 99100),
(10, 'Pulsa Nasional', 'Indosat Ooredoo', 'IA5', 'Isat Promo 5 Ribu', 5795),
(11, 'Pulsa Nasional', 'Indosat Ooredoo', 'I5', 'Indosat 5rb', 5835),
(12, 'Pulsa Nasional', 'Indosat Ooredoo', 'IA10', 'Isat Promo 10 Ribu', 10805),
(13, 'Pulsa Nasional', 'Indosat Ooredoo', 'I10', 'Indosat 10rb', 10855),
(14, 'Pulsa Nasional', 'Indosat Ooredoo', 'I15', 'Indosat 15rb', 15930),
(15, 'Pulsa Nasional', 'Indosat Ooredoo', 'I20', 'Indosat 20rb', 20700),
(16, 'Pulsa Nasional', 'Indosat Ooredoo', 'I25', 'Indosat 25rb', 25500),
(17, 'Pulsa Nasional', 'Indosat Ooredoo', 'I30', 'Indosat 30rb', 30500),
(18, 'Pulsa Nasional', 'Indosat Ooredoo', 'I40', 'Indosat 40rb', 39665),
(19, 'Pulsa Nasional', 'Indosat Ooredoo', 'I50', 'Indosat 50rb', 49525),
(20, 'Pulsa Nasional', 'Indosat Ooredoo', 'I60', 'Indosat 60rb', 59700),
(21, 'Pulsa Nasional', 'Indosat Ooredoo', 'I80', 'Indosat 80rb', 78745),
(22, 'Pulsa Nasional', 'Indosat Ooredoo', 'I90', 'Indosat 90rb', 88005),
(23, 'Pulsa Nasional', 'Indosat Ooredoo', 'I100', 'Indosat 100rb', 97269),
(24, 'Pulsa Nasional', 'Smartfren', 'SM5', 'Smartfren 5rb', 4974),
(25, 'Pulsa Nasional', 'Smartfren', 'SM10', 'Smartfren 10rb', 10306),
(26, 'Pulsa Nasional', 'Smartfren', 'SM20', 'Smartfren 20rb', 20450),
(27, 'Pulsa Nasional', 'Smartfren', 'SM25', 'Smartfren 25rb', 24780),
(28, 'Pulsa Nasional', 'Smartfren', 'SM30', 'Smartfren 30rb', 30175),
(29, 'Pulsa Nasional', 'Smartfren', 'SM50', 'Smartfren 50rb', 50360),
(30, 'Pulsa Nasional', 'Smartfren', 'SM60', 'Smartfren 60rb', 60000),
(31, 'Pulsa Nasional', 'Smartfren', 'SM100', 'Smartfren 100rb', 99000),
(32, 'Pulsa Nasional', 'Telkomsel', 'S1', 'Telkomsel 1rb', 1655),
(33, 'Pulsa Nasional', 'Telkomsel', 'S2', 'Telkomsel 2rb', 2755),
(34, 'Pulsa Nasional', 'Telkomsel', 'S3', 'Telkomsel 3rb', 3755),
(35, 'Pulsa Nasional', 'Telkomsel', 'S4', 'Telkomsel 4rb', 4750),
(36, 'Pulsa Nasional', 'Telkomsel', 'SAO5', 'Telkomsel Promo 5rb', 5849),
(37, 'Pulsa Nasional', 'Telkomsel', 'S5', 'Telkomsel 5rb (Mahal Cepat)', 5925),
(38, 'Pulsa Nasional', 'Telkomsel', 'S6', 'Telkomsel 6rb', 6750),
(39, 'Pulsa Nasional', 'Telkomsel', 'SAO10', 'Telkomsel Promo 10rb', 10499),
(40, 'Pulsa Nasional', 'Telkomsel', 'SP10', 'Prioritas Tsel 10rb (Mahal Cepat)', 10845),
(41, 'Pulsa Nasional', 'Telkomsel', 'S10', 'Telkomsel 10rb', 11025),
(42, 'Pulsa Nasional', 'Telkomsel', 'S15', 'Telkomsel 15rb', 15350),
(43, 'Pulsa Nasional', 'Telkomsel', 'SP20', 'Telkomsel 20rb (Mahal Cepat)', 20340),
(44, 'Pulsa Nasional', 'Telkomsel', 'S20', 'Telkomsel 20rb', 20675),
(45, 'Pulsa Nasional', 'Telkomsel', 'S25', 'Telkomsel 25rb', 25302),
(46, 'Pulsa Nasional', 'Telkomsel', 'S30', 'Telkomsel 30rb', 30200),
(47, 'Pulsa Nasional', 'Telkomsel', 'S35', 'Telkomsel 35rb', 35150),
(48, 'Pulsa Nasional', 'Telkomsel', 'S40', 'Telkomsel 40rb', 40025),
(49, 'Pulsa Nasional', 'Telkomsel', 'S45', 'Telkomsel 45rb', 45050),
(50, 'Pulsa Nasional', 'Telkomsel', 'S50', 'Telkomsel 50rb', 49700),
(51, 'Pulsa Nasional', 'Telkomsel', 'S55', 'Telkomsel 55rb', 54950),
(52, 'Pulsa Nasional', 'Telkomsel By.U', 'BYU1', 'By U 1 Ribu', 1050),
(53, 'Pulsa Nasional', 'Telkomsel By.U', 'BYU5', 'By U 5 Ribu', 5500),
(54, 'Pulsa Nasional', 'Telkomsel By.U', 'BYU10', 'By U 10 Ribu', 10500),
(55, 'Pulsa Nasional', 'Telkomsel By.U', 'BYU15', 'By U 15 Ribu', 15500),
(56, 'Pulsa Nasional', 'Telkomsel By.U', 'BYU20', 'By U 20 Ribu', 20400),
(57, 'Pulsa Nasional', 'Telkomsel By.U', 'BYU25', 'By U 25 Ribu', 25300),
(58, 'Pulsa Nasional', 'Telkomsel By.U', 'BYU30', 'By U 30 Ribu', 30200),
(59, 'Pulsa Nasional', 'Telkomsel By.U', 'BYU40', 'By U 40 Ribu', 40100),
(60, 'Pulsa Nasional', 'Telkomsel By.U', 'BYU50', 'By U 50 Ribu', 50000),
(61, 'Pulsa Nasional', 'Telkomsel By.U', 'BYU75', 'By U 75 Ribu', 74750),
(62, 'Pulsa Nasional', 'Telkomsel By.U', 'BYU100', 'By U 100 Ribu', 99500),
(63, 'Pulsa Nasional', 'Telkomsel By.U', 'BYU150', 'By U 150 Ribu', 148700),
(64, 'Pulsa Nasional', 'Tri Indonesia', 'T1', 'Three 1rb', 1202),
(65, 'Pulsa Nasional', 'Tri Indonesia', 'T2', 'Three 2rb', 2189),
(66, 'Pulsa Nasional', 'Tri Indonesia', 'T3', 'Three 3rb', 3393),
(67, 'Pulsa Nasional', 'Tri Indonesia', 'T4', 'Three 4rb', 4718),
(68, 'Pulsa Nasional', 'Tri Indonesia', 'T5', 'Three 5rb', 5331),
(69, 'Pulsa Nasional', 'Tri Indonesia', 'T10', 'Three 10rb', 10231),
(70, 'Pulsa Nasional', 'Tri Indonesia', 'T20', 'Three 20rb', 20346),
(71, 'Pulsa Nasional', 'Tri Indonesia', 'T25', 'Three 25rb', 24740),
(72, 'Pulsa Nasional', 'Tri Indonesia', 'T30', 'Three 30rb', 29745),
(73, 'Pulsa Nasional', 'Tri Indonesia', 'T50', 'Three 50rb', 49700),
(74, 'Pulsa Nasional', 'Tri Indonesia', 'T100', 'Three 100rb', 98250),
(75, 'Pulsa Nasional', 'XL Axiata', 'X5', 'XL 5rb (Mahal Cepat)', 5850),
(76, 'Pulsa Nasional', 'XL Axiata', 'XP5', 'XL 5rb (Murah Lambat)', 5860),
(77, 'Pulsa Nasional', 'XL Axiata', 'X10', 'XL 10rb (Mahal Cepat)', 10820),
(78, 'Pulsa Nasional', 'XL Axiata', 'X15', 'XL 15rb', 15700),
(79, 'Pulsa Nasional', 'XL Axiata', 'X25', 'XL 25rb', 25350),
(80, 'Pulsa Nasional', 'XL Axiata', 'X30', 'XL 30rb', 30700),
(81, 'Pulsa Nasional', 'XL Axiata', 'X50', 'XL 50rb', 50000),
(82, 'Pulsa Nasional', 'XL Axiata', 'X100', 'XL 100rb', 99100),
(83, 'Pulsa Nasional', 'AXIS Axiata', 'KH5', 'XL 5 Rb Khusus 0859', 5850),
(84, 'Pulsa Nasional', 'AXIS Axiata', 'KHA5', 'Axis 5 Rb Khusus 0859', 5850),
(85, 'Pulsa Nasional', 'AXIS Axiata', 'KH10', 'XL 10 Rb Khusus 0859', 10820),
(86, 'Pulsa Nasional', 'AXIS Axiata', 'KHA10', 'Axis 10 Rb Khusus 0859', 10820),
(87, 'Pulsa Nasional', 'AXIS Axiata', 'KHA15', 'Axis 15 Rb Khusus 0859', 15400),
(88, 'Pulsa Nasional', 'AXIS Axiata', 'KH15', 'XL 15 Rb Khusus 0859', 15700),
(89, 'Pulsa Nasional', 'AXIS Axiata', 'KHA25', 'Axis 25 Rb Khusus 0859', 24880),
(90, 'Pulsa Nasional', 'AXIS Axiata', 'KH25', 'XL 25 Rb Khusus 0859', 25750),
(91, 'Pulsa Nasional', 'AXIS Axiata', 'KHA30', 'Axis 30 Rb Khusus 0859', 30250),
(92, 'Pulsa Nasional', 'AXIS Axiata', 'KH30', 'XL 30 Rb Khusus 0859', 30700),
(93, 'Pulsa Nasional', 'AXIS Axiata', 'KHA50', 'Axis 50 Rb Khusus 0859', 49575),
(94, 'Pulsa Nasional', 'AXIS Axiata', 'KH50', 'XL 50 Rb Khusus 0859', 50150),
(95, 'Pulsa Nasional', 'AXIS Axiata', 'KHA100', 'Axis 100 Rb Khusus 0859', 98850),
(96, 'Pulsa Nasional', 'AXIS Axiata', 'KH100', 'XL 100 Rb Khusus 0859', 99625);

-- --------------------------------------------------------

--
-- Struktur dari tabel `provider`
--

CREATE TABLE `provider` (
  `id_provider` int(12) NOT NULL,
  `kategori` varchar(255) NOT NULL,
  `nama_provider` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `provider`
--

INSERT INTO `provider` (`id_provider`, `kategori`, `nama_provider`) VALUES
(10, 'Pulsa Nasional', 'AXIS'),
(11, 'Pulsa Nasional', 'Indosat Ooredoo'),
(12, 'Pulsa Nasional', 'Smartfren'),
(13, 'Pulsa Nasional', 'Telkomsel'),
(14, 'Pulsa Nasional', 'Telkomsel By.U'),
(15, 'Pulsa Nasional', 'Tri Indonesia'),
(16, 'Pulsa Nasional', 'XL Axiata'),
(17, 'Pulsa Nasional', 'AXIS Axiata'),
(18, 'Pulsa Transfer', 'AXIS Transfer'),
(19, 'Pulsa Transfer', 'Indosat Transfer'),
(20, 'Pulsa Transfer', 'Telkomsel Transfer'),
(21, 'Pulsa Transfer', 'Tri Indonesia Transfer'),
(22, 'Pulsa Transfer', 'XL Transfer');

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `id_transaksi` int(12) NOT NULL,
  `kategori` varchar(255) NOT NULL,
  `provider` varchar(255) NOT NULL,
  `produk` varchar(255) NOT NULL,
  `keterangan_produk` text NOT NULL,
  `no_telepon` varchar(20) NOT NULL,
  `harga` int(13) NOT NULL,
  `waktu_pesan` varchar(255) NOT NULL,
  `status_pembayaran` varchar(25) NOT NULL,
  `tipe_pembayaran` varchar(25) NOT NULL,
  `tanggal_bayar` varchar(255) DEFAULT NULL,
  `kode_sn` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `transaksi`
--

INSERT INTO `transaksi` (`id_transaksi`, `kategori`, `provider`, `produk`, `keterangan_produk`, `no_telepon`, `harga`, `waktu_pesan`, `status_pembayaran`, `tipe_pembayaran`, `tanggal_bayar`, `kode_sn`) VALUES
(2, 'Pulsa', 'Indosat', 'I5', 'Indosat Pulsa 5rb', '08153567823', 7500, '2020-07-03 18:40:53', 'Telah Membayar', 'Tunai', '2020-07-03', '4356785764757755'),
(6, 'Internet', 'Indosat', 'FR1', 'Freedom Internet 1GB', '087757657576', 23454, '2020-07-05 17:01:01', 'Belum Membayar', 'Unknown', '', '435646436754344'),
(7, 'Pulsa', 'Indosat', 'I10', 'Indosat Pulsa 10rb', '085735325325', 10872, '2020-07-05 17:05:56', 'Belum Membayar', 'Unknown', '', '43567435346463432'),
(8, 'Internet', 'Indosat', 'FR3', 'Freedom Internet 3GB', '0815753242534', 54546, '2020-07-05 17:11:26', 'Telah Membayar', 'Tunai', '2020-07-05', '234567846464475443'),
(9, 'Internet', 'Indosat', 'FR1', 'Freedom Internet 1GB', '0815364573464', 23454, '2020-07-05 17:13:36', 'Belum Membayar', 'Unknown', '', '43567894534'),
(11, 'Pulsa', 'Indosat', 'I5', 'Indosat Pulsa 5rb', '08757456464', 5670, '2020-07-05 17:23:27', 'Telah Membayar', 'Tunai', '2020-07-07', '324567845365756765'),
(13, 'Internet', 'Indosat', 'FR3', 'Freedom Internet 3GB', '08123243535', 54546, '2020-07-05 18:19:30', 'Telah Membayar', 'Tunai', '2020-07-05', '76544567875757'),
(14, 'Pulsa Nasional', 'Indosat Ooredoo', 'I50', 'Indosat 50rb', '081573973861', 49525, '2020-07-07 14:16:37', 'Telah Membayar', 'Tunai', '2020-07-07', '45689033728524');

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `id_user` int(12) NOT NULL,
  `nama_user` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`id_user`, `nama_user`, `username`, `password`) VALUES
(11, 'Mohamad Esa ', 'helloEsa', '5416d7cd6ef195a0f7622a9c56b55e84'),
(14, 'Johanes', 'jo_akun', '1c63129ae9db9c60c3e8aa94d3e00495'),
(15, 'Komarudin', 'k1234', '81dc9bdb52d04dc20036dbd8313ed055'),
(16, 'Administrator', 'Admin', '21232f297a57a5a743894a0e4a801fc3');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `kategori`
--
ALTER TABLE `kategori`
  ADD PRIMARY KEY (`id_kategori`);

--
-- Indeks untuk tabel `produk`
--
ALTER TABLE `produk`
  ADD PRIMARY KEY (`id_produk`);

--
-- Indeks untuk tabel `provider`
--
ALTER TABLE `provider`
  ADD PRIMARY KEY (`id_provider`);

--
-- Indeks untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id_transaksi`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `kategori`
--
ALTER TABLE `kategori`
  MODIFY `id_kategori` int(12) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT untuk tabel `produk`
--
ALTER TABLE `produk`
  MODIFY `id_produk` int(12) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=97;

--
-- AUTO_INCREMENT untuk tabel `provider`
--
ALTER TABLE `provider`
  MODIFY `id_provider` int(12) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `id_transaksi` int(12) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT untuk tabel `user`
--
ALTER TABLE `user`
  MODIFY `id_user` int(12) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
