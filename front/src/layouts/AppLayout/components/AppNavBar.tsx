import { Link } from "react-router-dom";
import { usePageStoreActions, usePageStoreState } from "src/stores/pageStore";

export const AppNavBar = () => {
  const { setCurrentPage } = usePageStoreActions();

  const onClickNavBar = (page: string) => {
    setCurrentPage(page);
  };

  return (
    <>
      <div
        style={{
          backgroundColor: "white",
          height: 80,
          display: "flex",
          justifyContent: "space-between",
        }}
      >
        <Link
          to={"/"}
          style={{ width: "25%", textDecoration: "none", color: "inherit" }}
          onClick={() => onClickNavBar("메인")}
        >
          메인
        </Link>
        <Link
          to={"/report"}
          style={{ width: "25%", textDecoration: "none", color: "inherit" }}
          onClick={() => onClickNavBar("분석")}
        >
          분석
        </Link>
        <Link
          to={"/chat"}
          style={{ width: "25%", textDecoration: "none", color: "inherit" }}
          onClick={() => onClickNavBar("채팅")}
        >
          채팅
        </Link>
        <Link
          to={"/mypage"}
          style={{ width: "25%", textDecoration: "none", color: "inherit" }}
          onClick={() => onClickNavBar("내 정보")}
        >
          내 정보
        </Link>
      </div>
    </>
  );
};
